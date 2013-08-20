import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

    val appName         = "scalatest"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      // Add your project dependencies here,
      "org.scalatest" % "scalatest_2.10" % "2.0.RC1-SNAP4" % "test"
    )

    val main = play.Project(appName, appVersion, appDependencies).settings(
      // Add your own project settings here      
    )

}
