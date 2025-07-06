

lazy val root = (project in file(".")).settings(
  name := "scalatest-website",
  version := "250706",
  scalaVersion := "3.3.4",
  libraryDependencies ++= Seq(
    guice,
    "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.0" % Test
  ),
  fork := false, 
  Docker / packageName := "artima/scalatest-website", 
  Docker / maintainer := "Artima Inc.", 
  dockerExposedPorts ++= Seq(9000), 
  dockerUpdateLatest := true,
  dockerBaseImage := "eclipse-temurin:17",
  Universal / javaOptions ++= Seq(
    // -J params will be added as jvm parameters
    "-J-Xmx128m",
    "-J-Xms64m"
  )
  //classLoaderLayeringStrategy := ClassLoaderLayeringStrategy.Flat  // Added in sbt 1.3 (https://www.scala-sbt.org/1.x/docs/sbt-1.3-Release-Notes.html), but still not working, so we fall back to sbt 1.2.
).enablePlugins(PlayScala, JavaServerAppPackaging, DockerPlugin)
