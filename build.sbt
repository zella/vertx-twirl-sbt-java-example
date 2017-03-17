name := """vertx-twirl-sbt-java"""

version := "1.0"

scalaVersion := "2.11.8"

lazy val root = (project in file(".")).enablePlugins(SbtTwirl)

libraryDependencies += "io.vertx" % "vertx-core" % "3.4.1"