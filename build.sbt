lazy val root = (project in file("."))
  .aggregate(util, spark)
  .settings(
    name := "Test 2.12"
  )

lazy val util = (project in file("util"))
  .settings(commonSettings: _*)
  .settings(crossScalaVersions := Seq("2.11.12", "2.12.7"))
  
lazy val spark = (project in file("spark"))
  .settings(commonSettings: _*)
  .settings(scalaVersion := "2.11.12")
  .dependsOn(util)

lazy val service = (project in file("service"))
  .settings(commonSettings: _*)
  .dependsOn(util)

lazy val commonSettings = Seq(
  version := "0.0.1-SNAPSHOT",
  scalaVersion := "2.12.7",
  crossScalaVersions := Seq()
)
