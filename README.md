Scala sort algorithm
===============

### description
Sort algorithm written with Scala . I wrote this code to study Scala lang .

### Samples

merge sort
---

### code

    object Stub {
      def main(args: Array[String]) {
        mergesort
      }

      private def mergesort = {
        import com.rkaneko.algorithm.sort.MergeSort

        val array = Array(30, 80, 50, 10, 70, 1)
        println("willing sort : ")
        println(array.mkString(" "))

       def ascent = {
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

### result

    willing sort
    30 80 50 10 70 1
    ascending sort
    1 10 30 50 70 80
    descending sort
    80 70 50 30 10 1
