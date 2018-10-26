package com.example.service

import com.example.util._

object HelloService {
  def main(args: Array[String]): Unit = {
    // Check that we're running in 2.12

    println("Checking for 2.12...")
    val xx = scala.runtime.LambdaDeserializer
    println("Excellent, we're in 2.12!")

    Hello()
  }
}
