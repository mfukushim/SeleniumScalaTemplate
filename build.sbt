name := "SeleniumScalaTmplate"

version := "0.1"

scalaVersion := "2.12.8"

scalacOptions += "-Ypartial-unification"


libraryDependencies ++= Seq(
  "joda-time" % "joda-time" % "2.9.9",
  "org.typelevel" %% "cats-core" % "1.6.0",
  "com.h2database" % "h2" % "1.4.192",
  "com.typesafe" % "config" % "1.3.4",
  "org.scalatest" %% "scalatest" % "3.0.8" % "test",
  "org.seleniumhq.selenium" % "selenium-java" % "3.141.59" % "test",
  "com.decodified" %% "scala-ssh" % "0.9.0",

)
