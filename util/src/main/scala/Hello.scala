package com.example.util

object Hello {
  val scalaVersion = try {
    Class.forName("scala.runtime.LambdaDeserializer")
    "2.12"
  } catch {
    case e: ClassNotFoundException =>
      "2.11"
  }

  def apply() = println(s"Hello world! I appear to be running in Scala $scalaVersion")
}
