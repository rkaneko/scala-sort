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
      println("ascending sort")
      println(MergeSort.execute(array) mkString " ")
    }

    def descend = {
      println("descending sort")
      println(MergeSort.execute(array, true) mkString " ")
    }

    ascend
    descend
  }
}
