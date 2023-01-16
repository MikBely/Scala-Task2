import scala.collection.mutable.ListBuffer
import java.util.Date
//------------------------Task1---------------//
class Ball(var name:String, var weight:Double, var color:String){
  var name_ = this.name
  var weight_ = this.weight
  var color_ = this.color
  def getWeight():Double =
    weight_
  def getColor():String =
    color_
}


class Basket(list:ListBuffer[Ball]){
  val currentList = this.list
  def getSummaryWeight(): Double =
    var basketWeight: Double = 0
    for (i <- 0 until currentList.length) {
      basketWeight = basketWeight + currentList(i).getWeight()

     }
    basketWeight
  def getWeightByColor(color:String):Double =
    var colorWeight: Double = 0
    for (i <- 0 until currentList.length) {
      if (currentList(i).getColor() == color)
        colorWeight = colorWeight + currentList(i).getWeight()
    }
    colorWeight

  def getNumberOfColorBalls(color: String): Int =
    var counter: Int = 0
    for (i <- 0 until currentList.length) {
      if (currentList(i).getColor() == color)
        counter=counter+1
    }
    counter

  def sortByWeight(sortType:String): ListBuffer[Ball] =
    if (sortType == "ascending")
      for (i <- 0 until currentList.length)
        for (j <- 0 until currentList.length - i - 1)
          if (currentList(j + 1).getWeight() < currentList(j).getWeight())
          then
            var buf = currentList(j)
            currentList(j) = currentList(j + 1)
            currentList(j + 1) = buf
    if (sortType == "descending")
      for (i <- 0 until currentList.length)
        for (j <- 0 until currentList.length - i - 1)
          if (currentList(j + 1).getWeight() > currentList(j).getWeight())
          then
            var buf = currentList(j)
            currentList(j) = currentList(j + 1)
            currentList(j + 1) = buf
    currentList
}
//---------------------Task2-----------------------//


@main def main1() : Unit =
  //-------------------Task1----------------------//
  var ball1 = new Ball("1",13.0,"blue")
  var ball2 = new Ball("2", 17.0, "green")
  var ball3 = new Ball("3", 13.0, "blue")
  var ball4 = new Ball("4", 1.0, "white")
  var ball5 = new Ball("5", 6.0, "green")
  var ball6 = new Ball("6", 5.0, "blue")
  var ball7 = new Ball("7", 3.0, "blue")
  var ball8 = new Ball("8", 5.0, "black")
  var ball9 = new Ball("9", 3.0, "red")
  var ball10 = new Ball("10", 13.0, "green")
  var ball11 = new Ball("11", 18.0, "blue")
  var ball12 = new Ball("12", 14.0, "yellow")
  var ball13 = new Ball("13", 5.0, "yellow")
  val ballsList =  ListBuffer(ball1,ball2,ball3,ball4,ball5,ball6,ball7,ball8,ball9,ball10,ball11,ball12,ball13);
  var basket = new Basket (ballsList);
 // println(basket.getSummaryWeight());
  //println(basket.getWeightByColor("green"));
 // println(basket.getNumberOfColorBalls("blue"));
  //basket.sortByWeight("ascending")
  basket.sortByWeight("descending")
  for (elem<-ballsList)
    println(elem.name)


//--------------------------------------------------//
//-----------------Task2----------------------------//