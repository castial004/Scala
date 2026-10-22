package Week14

import org.saddle._
import org.saddle.io._
import spire.math.Rational
import vegas._
import vegas.render.WindowRenderer._

object FruitPriceSpireAnalysis {

  def main(args: Array[String]): Unit = {

    // 1. Load CSV Data using Saddle
    val file = CsvFile("fruit_prices.csv")
    val raw: Frame[Int, Int, String] = CsvParser.parse(file)
    val df = raw.withColIndex(0) // Set first row as header

    // 2. Identify unique fruits
    val fruits = df.col("fruit").toSeq.map(_._2).distinct
    println("Analyzing fruits: " + fruits.mkString(", "))

    // 3. Compute precise stats using Spire and visualize
    for (fruit <- fruits) {
      println(s"\n--- Analysis for $fruit ---")
      
      // Filter data for the specific fruit
      val fruitDf = df.rfilter(row => row.at("fruit") == fruit)
      
      // Extract prices and convert to Spire Rational for exact precision
      val pricesStr = fruitDf.col("price").toSeq.map(_._2)
      val prices: Seq[Rational] = pricesStr.map(p => Rational(BigDecimal(p)))
      
      // Calculate Mean and Variance
      val meanPrice = prices.sum / Rational(prices.size)
      val variancePrice = prices.map(p => (p - meanPrice).pow(2)).sum / Rational(prices.size)
      
      println(s"Exact Mean: $meanPrice")
      println(f"Approximate Mean: ${meanPrice.toDouble}%.4f")
      println(s"Exact Variance: $variancePrice")
      println(f"Approximate Variance: ${variancePrice.toDouble}%.4f")

      // 4. Prepare data for Vegas Visualization
      val dates = fruitDf.col("date").toSeq.map(_._2)
      val pricesDouble = prices.map(_.toDouble)
      
      val data = dates.zip(pricesDouble).map { case (d, p) =>
        Map("date" -> d, "price" -> p)
      }

      // 5. Build and display Vegas chart
      val plot = Vegas(s"$fruit Price Trend").
        withData(data: _*).
        encodeX("date", Temp).
        encodeY("price", Quant).
        mark(Line)

      plot.show
    }
  }
}
