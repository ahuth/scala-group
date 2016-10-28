name := "Actors"

version := "1.0"

scalaVersion := "2.11.8"

sbtVersion := "0.13.12"

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.4.11"
libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % "2.4.11" % "test"
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.1" % "test"
