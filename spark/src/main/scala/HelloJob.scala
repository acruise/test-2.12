package com.example.spark

import com.example.util.Hello

import org.apache.spark.launcher.SparkLauncher

object SparkMain {
  def main(args: Array[String]): Unit = {
    // Check that Spark is loadable
    val lunch = new SparkLauncher()

    // Check that we're running in 2.11 somehow?

    try {
      Class.forName("scala.runtime.LambdaDeserializer$")
      sys.error("We can't run in 2.12!")
    } catch {
      case e: ClassNotFoundException =>
        // OK!
    }

    Hello()
    println(lunch)
  }
}
