import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

    val appName         = "scalatest"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      // Add your project dependencies here,
      "org.scalatestplus" % "play_2.10" % "1.0-RC1" % "test"
    )

    val main = play.Project(appName, appVersion, appDependencies).settings(
      // Add your own project settings here      
    )

}
