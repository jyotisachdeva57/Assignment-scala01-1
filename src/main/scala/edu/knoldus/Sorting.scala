package edu.knoldus

class Sorting {
  def bubbleSort(list: Array[Int]): Array[Int] = {
    val lt = list.length
    for (i <- 0 until lt - 1) {
      for (j <- 0 until lt - i - 1) {
        if (list(j) > list(j + 1)) {
          val temp = list(j)
          list(j) = list(j + 1)
          list(j + 1) = temp
        }
      }
    }
    list
  }

  def selectionSort(list: Array[Int]): Array[Int] = {
    for (i <- 0 until list.length - 1) {
      var minindx = i
      for (j <- (i + 1) until list.length) {
        if (list(j) < list(minindx)) {
          minindx = j
        }
      }
      if (i != minindx) {
        val swap = list(i);
        list(i) = list(minindx);
        list(minindx) = swap;
      }
    }
    list
  }

  def insertionSort(list: Array[Int]): Array[Int] = {
    for (i <- 1 until list.length) {
      for (j <- i until 0 by -1) {
        if (list(j) < list(j - 1)) {
          val temp = list(j)
          list(j) = list(j - 1)
          list(j - 1) = temp
        }
      }
    }
    list
  }
}
