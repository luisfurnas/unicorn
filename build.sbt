ThisBuild / version := "0.1.0"

ThisBuild / scalaVersion := "3.1.0"

lazy val root = (project in file("."))
  .settings(
    name := "unicorn-scala",
    idePackagePrefix := Some("unicorn")
  )
