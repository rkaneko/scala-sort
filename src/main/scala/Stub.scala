package com.rkaneko

object Stub {
  def main(args: Array[String]) {
    mergesort
  }

  private def mergesort = {
    import com.rkaneko.algorithm.sort.MergeSort

    val array = Array(30, 80, 50, 10, 70, 1)
    println("willing sort :")
    println(array.mkString(" "))

    def ascend = {
      implicit val comparison = (a: Int, b: Int) => a - b
      println("ascending sort")
      println(MergeSort.execute(array) mkString " ")
    }

    def descend = {
      implicit val comparison = (a: Int, b: Int) => b - a
      println("descending sort")
      println(MergeSort.execute(array) mkString " ")
    }

    ascend
    descend
  }
}
