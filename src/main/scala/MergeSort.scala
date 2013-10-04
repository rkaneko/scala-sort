package com.rkaneko.algorithm.sort

import scala.reflect.ClassTag

/**
 * Merge sort .
 */
object MergeSort {

  /**
   * Sort x with merge sort .
   *
   * @tparam T Type parameter .
   * @param x The array you want sort .
   * @param comparison Comparison expression for array elements .
   */
  def execute[T<% Ordered[T]](x: Array[T], isDescending: Boolean = false)(implicit c: ClassTag[T]) = {
    def sort(array: Array[T]): Array[T] = {
      val n = array.length
      if (n <= 1)
        return array

      val m = n / 2

      val firstHalf = sort(array.take(m))
      val secondHalf = sort(array.drop(m))

      merge(firstHalf, secondHalf)
    }

    def merge(first: Array[T], second: Array[T]): Array[T] = {
      (first.headOption, second.headOption) match {
        case (Some(h1), Some(h2)) => {
          if (isDescending ^ (h1 < h2)) h1 +: merge(first.tail, second)
          else h2 +: merge(first, second.tail)
        }
        case (None, Some(h2)) => second
        case (Some(h1), None) => first
        case (None, None) => Array[T]()
      }
    }

    sort(x)
  }
}
