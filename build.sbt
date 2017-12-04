name := "scala-with-cats"

version := "0.1"

scalaVersion := "2.12.4"

libraryDependencies += "org.typelevel" %% "cats-core" % "1.0.0-RC1"

scalacOptions ++= Seq(
  "-Xfatal-warnings",
  "-Ypartial-unification"
)