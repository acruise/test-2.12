package com.example.spark

import com.example.util.Hello
import org.apache.spark.launcher.SparkLauncher

object SparkMain {
  def main(args: Array[String]): Unit = {
    Hello()

    // Check that Spark is loadable
    val lunch = new SparkLauncher()
    println(lunch)
  }
}
