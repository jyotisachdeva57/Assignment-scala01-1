package edu.knoldus

class Searching {

  def binarySearch(array: Array[Int], elem: Int): Boolean = {
    val right = array.length
    var left = 0
    binarySrch(array, elem, 0, right - 1)
    true
  }


  def linearSearch(array: Array[Int], elem: Int): Boolean = {
    if (array.isEmpty) {
      println("list is empty")
      return false
    }
    else if (array.head == elem) {
      println("element found")
      return true
    }
    else {
      for (lst <- array) {
        if (lst == elem) {
          println("element found")
          return true
        }
      }
    }
    false
  }

  def binarySrch(list: Array[Int], key: Int, left: Int, right: Int): Int = {
    if (left > right) {
      print("invalid indexes")
      return -1
    }
    val mid = left + (right - left) / 2
    if (list(mid) == key) {
      print("element found at")
      return mid
    }
    else if (list(mid) > key) {
      return binarySrch(list, key, left, mid - 1)
    }
    else {
      return binarySrch(list, key, mid + 1, right)
    }
  }

}
