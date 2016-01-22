name := "dataCleanUp"

organization := "com.virdis"

version := "0.0.1"

scalaVersion := "2.10.6"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.1" % "test" withSources() withJavadoc(),
  "org.scalacheck" %% "scalacheck" % "1.12.1" % "test" withSources() withJavadoc(),
  "org.apache.spark" % "spark-core_2.10" % "1.5.2" % "provided",
  "org.apache.spark" % "spark-sql_2.10" % "1.5.2" % "provided",
  "com.datastax.spark" % "spark-cassandra-connector_2.10" % "1.5.0-RC1"
)

assemblyJarName in assembly := "gitDiscover.jar"

initialCommands := "import com.virdis.datacleanup._"

