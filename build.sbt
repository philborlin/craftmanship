organization := "com.example"

name := "craftsmanship"
 
version := "0.1.0"
 
scalaVersion := "2.10.3"

resolvers += "Typesafe Repository (releases)" at "http://repo.typesafe.com/typesafe/releases/"

// Testing
libraryDependencies ++= Seq(
	"org.scalatest" % "scalatest_2.10" % "2.0",
	"org.scalacheck" % "scalacheck_2.10" % "1.11.1"
)

// Logging
libraryDependencies ++= Seq(
	"com.typesafe" % "scalalogging-log4j_2.10" % "1.0.1",
	"org.apache.logging.log4j" % "log4j-core" % "2.0-beta9"
)
