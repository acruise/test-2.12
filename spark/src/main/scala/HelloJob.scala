package com.example.spark

import com.example.util.Hello

import org.apache.spark.launcher.SparkLauncher

object SparkMain {
  def main(args: Array[String]): Unit = {
    // Check that Spark is loadable
    val lunch = new SparkLauncher()

    try {
      println("Checking for 2.12...")
      Class.forName("scala.runtime.LambdaDeserializer$")
      sys.error("We can't run in 2.12!")
    } catch {
      case e: ClassNotFoundException =>
        println("Excellent, not in 2.12!")
    }

    Hello()
    println(lunch)
  }
}
