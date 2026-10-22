import breeze.linalg._
import plotly._
import plotly.element._
import plotly.layout._
import plotly.Plotly._

object RevenueAnalysis {

  // Case class representing one fruit record
  case class FruitRecord(fruit: String, price: Double, quantity: Double)

  def main(args: Array[String]): Unit = {

    // 1. Dataset (inline)
    val records: List[FruitRecord] = List(
      FruitRecord("apple",  1.20, 100),
      FruitRecord("banana", 0.80, 150),
      FruitRecord("orange", 1.10, 120),
      FruitRecord("apple",  1.35,  95),
      FruitRecord("banana", 0.75, 160),
      FruitRecord("orange", 1.15, 110),
      FruitRecord("apple",  1.25, 105),
      FruitRecord("banana", 0.85, 140),
      FruitRecord("orange", 1.20, 115)
    )
    println("Dataset Loaded: " + records.size + " records")

    // 2. Build Breeze vectors for price and quantity
    val prices: DenseVector[Double]     = DenseVector(records.map(_.price).toArray)
    val quantities: DenseVector[Double] = DenseVector(records.map(_.quantity).toArray)

    // 3. Element-wise revenue computation using Breeze
    val revenues: DenseVector[Double] = prices :* quantities
    println("\nRow-wise Revenue Vector: " + revenues)

    // 4. Aggregate total revenue by fruit type
    // Note: .view.mapValues(...).toMap is required for Scala 2.13+
    val revenueByFruit: Map[String, Double] =
      records.zip(revenues.toArray)
             .groupBy(_._1.fruit)
             .view.mapValues(_.map(_._2).sum).toMap

    println("\nTotal Revenue per Fruit:")
    revenueByFruit.foreach { case (fruit, total) =>
      println(f"  $fruit -> $$${total}%.2f")
    }

    // 5. Prepare data for Plotly bar chart
    val fruitNames   : Seq[String] = revenueByFruit.keys.toSeq
    val totalRevenues: Seq[Double] = revenueByFruit.values.toSeq

    // 6. Build and render Plotly bar chart
    val bar = Bar(
      x = fruitNames,
      y = totalRevenues
    ).withName("Revenue")

    // Plotly layout uses Option[String] for axis titles
    val layout = Layout(
      title = "Total Revenue per Fruit Type",
      xaxis = Axis(title = Some("Fruit")),
      yaxis = Axis(title = Some("Revenue ($)"))
    )

    // Render the chart to an HTML file
    BarChart(Seq(bar), layout).plot("revenue_bar_chart.html")
    
    println("\nBar chart saved to revenue_bar_chart.html")
  }
}