package com.bao.zi
import scala.util.control.Breaks._
// _符号代表所有

object bb {
  def main(args: Array[String]): Unit = {   //for 循环
    breakable {
      for (i <- 1 to 10) { // i是外层循环， j是内层循环
        if (i == 5) break() else println(i)   //break() 退出循环 。如果i等于5，就退出循环，否则就打印输出
      }
    }
  }
}

/////
////222


