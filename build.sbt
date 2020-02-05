name := """play-java-starter-example"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.13.0"

val playPac4jVersion = "4.0.0"
val pac4jVersion = "2.1.0"

javacOptions ++= Seq(
  "-encoding", "UTF-8",
  "-parameters",
  "-Xlint:unchecked",
  "-Xlint:deprecation",
  "-Werror"
)

libraryDependencies += guice

// Test Database
libraryDependencies += "com.h2database" % "h2" % "1.4.199"

// Testing libraries for dealing with CompletionStage...
libraryDependencies += "org.assertj" % "assertj-core" % "3.11.1" % Test
libraryDependencies += "org.awaitility" % "awaitility" % "3.1.3" % Test
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.41"

libraryDependencies += javaJdbc
libraryDependencies += cache
libraryDependencies += javaWs
libraryDependencies += "io.ebean" % "ebean" % "11.22.10"
libraryDependencies ++=  Seq(
	javaJdbc,
	javaJpa,
	javaCore,
	evolutions,
"javax.persistence" % "persistence-api" % "1.0.2",

"org.pac4j" % "play-pac4j" % playPac4jVersion,
  "org.pac4j" % "pac4j-oidc" % pac4jVersion exclude("commons-io" , "commons-io"),
  "commons-io" % "commons-io" % "2.4",
  "org.mindrot" % "jbcrypt" % "0.3m",

)


// Make verbose tests
testOptions in Test := Seq(Tests.Argument(TestFrameworks.JUnit, "-a", "-v"))

routesGenerator := InjectedRoutesGenerator
