package Week13

import org.saddle._
import org.saddle.io._
import vegas._
import vegas.render.WindowRenderer._

object FruitPriceAnalysis {

  // Filter records where the fruit is "apple"
  def filterApples(df: Frame[Int, String, String]): Frame[Int, String, String] = {
    df.rfilter { row =>
      row.at("fruit") == "apple"
    }
  }








  // Compute the mean of the price column
  def averagePrice(df: Frame[Int, String, String]): Double = {
    val prices: Series[Int, Double] = df.col("price").mapValues(_.toDouble)
    prices.mean
  }

  def main(args: Array[String]): Unit = {

    // 1. Load the CSV data
    val file = CsvFile("fruit_prices.csv")
    val raw: Frame[Int, Int, String] = CsvParser.parse(file)
    val df = raw.withColIndex(0)   // use first row as header
    println("Raw Data Preview:")
    df.print()

    // 2. Filter for apples
    val apples = filterApples(df)
    println("\nFiltered Apple Records:")
    apples.print()

    // 3. Compute the average price of apples
    val avg = averagePrice(apples)
    println(f"\nAverage Apple Price: $avg%.2f")

    // 4. Prepare data for Vegas plotting
    val dates  = apples.col("date").toSeq.map(_._2)
    val prices = apples.col("price").toSeq.map(_._2.toDouble)
    val data   = dates.zip(prices).map { case (d, p) =>
      Map("date" -> d, "price" -> p)
    }




    // 5. Build and display the Vegas line chart
    val plot = Vegas("Apple Price Trend").
      withData(data: _*).
      encodeX("date", Temp).
      encodeY("price", Quant).
      mark(Line)

    plot.show
  }
}

