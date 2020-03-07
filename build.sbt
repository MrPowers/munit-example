resolvers += "Spark Packages Repo" at "http://dl.bintray.com/spark-packages/maven"

name := "munit-example"

version := "0.0.1"

scalaVersion := "2.12.10"

libraryDependencies += "org.scalameta" %% "munit" % "0.5.2"

testFrameworks += new TestFramework("munit.Framework")

// test suite settings
//fork in Test := true
//javaOptions ++= Seq("-Xms512M", "-Xmx2048M", "-XX:MaxPermSize=2048M", "-XX:+CMSClassUnloadingEnabled")

// JAR file settings

// don't include Scala in the JAR file
//assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = false)

// Add the JAR file naming conventions described here: https://github.com/MrPowers/spark-style-guide#jar-files
// You can add the JAR file naming conventions by running the shell script
