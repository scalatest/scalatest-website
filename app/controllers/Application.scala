/**
 * Copyright 2010-2013 Artima, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package controllers

import play.api._
import play.api.mvc._
import examples.StyleTraitExamples


class Application extends Controller {

  import Application._

  def index = Action {
    Ok(views.html.index())
  }

  def install = Action {
    Ok(views.html.install())
  }

  def download = Action {
    Redirect(routes.Application.install.url)
  }

  def olderReleases = Action {
    Ok(views.html.olderReleases())
  }

  def quickStart = Action {
    Ok(views.html.quickStart())
  }

  def scaladoc = Action {
    Ok(views.html.scaladoc())
  }

  def videos = Action {
    Ok(views.html.videos())
  }

  def community = Action {
    Redirect(routes.Application.about.url)
  }

  def supersafe = Action {
    Ok(views.html.supersafe())
  }

  def about = Action {
    Ok(views.html.about())
  }

  def donate = Action {
    Ok(views.html.donate())
  }

  def sponsor = Action {
    Ok(views.html.sponsor())
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

  private val oldScaladocStyle30Releases = List("3.0.0", "3.0.1", "3.0.2", "3.0.3", "3.0.4")
  def scaladocsFile(release: String, file: String) = Action {
    if (release.startsWith("1.") || release.startsWith("2.") || oldScaladocStyle30Releases.contains(release))
      Redirect(scaladocsLocation + "/" + release + "/index.html#" + file)
    else
      Redirect(scaladocsLocation + "/" + release + "/" + file.replaceAll("\\.", "/") + ".html")
  }

  // Redirect legacy releases URLs (the are too big for free heroku,
  // so I'll put them on Artima for now)
  def releases(zipFile: String) = Action {
    Redirect(releasesLocation + "/" + zipFile)
  }

  def atAGlance(styleName: String) = Action {
    StyleTraitExamples.examples.get(styleName) match {
      case Some(examples) => Ok(views.html.atAGlance(examples))
      case None => NotFound("Style trait " + styleName + " not found.")
    }
  }

  def bareAtAGlance() = Action {
    Redirect(routes.Application.atAGlance("FlatSpec").url)
  }
}

object Application {

  val latestScaladoc =          "http://doc.scalatest.org/3.2.0"
  val latestScalacticScaladoc = "http://doc.scalactic.org/3.2.0"
  val latestVersion = "3.2.2"
  val latestSuperSafeVersion = "1.1.10"
  val milestoneVersion = "3.2.0"
  val milestoneJar = "https://oss.sonatype.org/content/groups/public/org/scalatest/scalatest_2.11/3.2.0-RC3/scalatest_2.11-3.2.0-RC3.jar"
  val latestJar = "https://oss.sonatype.org/content/groups/public/org/scalatest/scalatest-app_2.13/3.2.0/scalatest-app_2.13-3.2.0.jar"
  val milestoneScaladoc = "http://www.artima.com/docs-scalatest-3.2.0-RC3"
  val milestoneScalacticScaladoc = "http://www.artima.com/docs-scalactic-3.2.0-RC3"
  val scaladocsLocation = "https://www.scalatest.org/scaladoc"
  val releasesLocation = "http://www.artima.com/downloadScalaTest"
  val baseScalaVersion = "2.13.3"
  val majorMinorScalaVersion = "2.13"
  val latestScaladocFor192 = "http://doc.scalatest.org/1.9.2"
  val latestSeleniumVersion = "3-141"
  val latestEasyMockVersion = "3-2" 
  val latestJMockVersion = "2-8"
  val latestJUnitVersion = "4-13"
  val latestMockitoVersion = "3-4"
  val latestScalaCheckVersion = "1-15"
  val latestScalaCheckPlusVersion = "3.2.2.0"
  val latestTestNGVersion = "6-7"  
  val quickStartXmlJar = "https://repo1.maven.org/maven2/org/scala-lang/modules/scala-xml_2.13/1.2.0/scala-xml_2.13-1.2.0.jar"
  val latestPlusScalaCheckDoc = "plus-scalacheck-1.15/3.2.2.0"
  val latestPlusEasyMockDoc = "plus-easymock-3.2/3.2.2.0"
  val latestPlusJMockDoc = "plus-jmock-2.8/3.2.2.0"
  val latestPlusMockitoDoc = "plus-mockito-3.4/3.2.2.0"

  def scaladocsPageUrl(file: String, version: String = latestVersion): String = {
    val oldScaladocStyle30Releases = List("3.0.0", "3.0.1", "3.0.2", "3.0.3", "3.0.4")
    val filePath = if (version.startsWith("1.") || version.startsWith("2.") || oldScaladocStyle30Releases.contains(version)) {
      s"$version/index.html#$file"
    } else
      s"$version/${file.replaceAll("\\.", "/")}.html"

    routes.Assets.at("/public/scaladoc", filePath).toString
  }
}
