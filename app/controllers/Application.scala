package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  val latestScaladoc = "http://doc.scalatest.org/1.8"
  val latestVersion = "1.8"
  val milestoneVersion = "2.0.M5"
  val milestoneScaladoc = "http://www.artima.com/docs-scalatest-2.0.M5"
  val scaladocsLocation = "http://doc.scalatest.org"
  val releasesLocation = "http://www.artima.com/downloadScalaTest"
  val baseScalaVersion = "2.9.0"

  def index = Action {
    Ok(views.html.index())
  }

  def download = Action {
    Ok(views.html.download())
  }

  def quickStart = Action {
    Ok(views.html.quickStart())
  }

  def scaladoc = Action {
    Ok(views.html.scaladoc())
  }

  def community = Action {
    Ok(views.html.community())
  }

  def about = Action {
    Ok(views.html.about())
  }

/*
  def releaseNotes = Action {
    Ok(views.html.releaseNotes())
  }
*/

  def gettingStartedWithFunSuite = Action {
    Ok(views.html.gettingStartedWithFunSuite())
  }

  def gettingStartedWithFunSpec = Action {
    Ok(views.html.gettingStartedWithFunSpec())
  }

  def gettingStartedWithFeatureSpec = Action {
    Ok(views.html.gettingStartedWithFeatureSpec())
  }

  def writingJunitAndTestngTestsInScala = Action {
    Ok(views.html.writingJunitAndTestngTestsInScala())
  }

  def gettingStartedWithJunit3InScala = Action {
    Ok(views.html.gettingStartedWithJunit3InScala())
  }

  def gettingStartedWithJunit4InScala = Action {
    Ok(views.html.gettingStartedWithJunit4InScala())
  }

  def gettingStartedWithTestngInScala = Action {
    Ok(views.html.gettingStartedWithTestngInScala())
  }

  // Redirect Scaladoc URLs
  def scaladocs(release: String) = Action {
    Redirect(scaladocsLocation + "/" + release + "/index.html")
  }

  def scaladocsFile(release: String, file: String) = Action {
    Redirect(scaladocsLocation + "/" + release + "/" + file)
  }

  // Redirect legacy releases URLs (the are too big for free heroku,
  // so I'll put them on Artima for now)
  def releases(zipFile: String) = Action {
    Redirect(releasesLocation + "/" + zipFile)
  }
}
