package com.hs.impatient.chapter11

/**
 * Created by hs on 2014/4/19.
 */
class Matrix(rowNum: Int, colNum: Int) {
  val matrix = Array.ofDim[Int](rowNum, colNum)
  def +(that: Matrix) = {
    val result = new Matrix(rowNum, colNum)
    if (rowNum != that.matrix.length || colNum != that.matrix(0).length)
      throw new IllegalArgumentException("matrix addition should have same column numer and row number")
    else {
      for (i <- 0 until rowNum)
        for (j <- 0 until colNum)
          result.matrix(i)(j) = matrix(i)(j) + (that.matrix)(i)(j)
    }
    result
  }
}

object Main extends scala.App{
  val matrix1 = new Matrix(2, 3)
  matrix1.matrix(1)(2) = 32
  val matrix2 = new Matrix(2, 3)
  matrix2.matrix(1)(1) = 1
  val matrix3 = matrix1 + matrix2
  println(matrix3.matrix(1)(2))
  println(matrix3.matrix(1)(1))
}