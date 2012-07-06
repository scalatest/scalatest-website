package controllers

import play.api._
import play.api.mvc._

object UserGuide extends Controller {

  def userGuideIndex = Action {
    Ok(views.html.userGuide.userGuideIndex())
  }

  def usingAssertions = Action {
    Ok(views.html.userGuide.usingAssertions())
  }

  def writingYourFirstTest = Action {
    Ok(views.html.userGuide.writingYourFirstTest())
  }

  def taggingYourTests = Action {
    Ok(views.html.userGuide.taggingYourTests())
  }

  def runningYourTests = Action {
    Ok(views.html.userGuide.runningYourTests())
  }

  def sharingFixtures = Action {
    Ok(views.html.userGuide.sharingFixtures())
  }

  def sharingTests = Action {
    Ok(views.html.userGuide.sharingTests())
  }

  def usingMatchers = Action {
    Ok(views.html.userGuide.usingMatchers())
  }

  def testingWithMockObjects = Action {
    Ok(views.html.userGuide.testingWithMockObjects())
  }

  def testsAsSpecifications = Action {
    Ok(views.html.userGuide.testsAsSpecifications())
  }

  def propertyBasedTesting = Action {
    Ok(views.html.userGuide.propertyBasedTesting())
  }

  def otherGoodies = Action {
    Ok(views.html.userGuide.otherGoodies())
  }

  def philosophyAndDesign = Action {
    Ok(views.html.userGuide.philosophyAndDesign())
  }

  def designAndPhilosophy = Action {
    Ok(views.html.userGuide.designAndPhilosophy())
  }

  def selectingAStyle = Action {
    Ok(views.html.userGuide.selectingAStyle())
  }

  def usingJunitRunner = Action {
    Ok(views.html.userGuide.usingJunitRunner())
  }

  def tableDrivenPropertyChecks = Action {
    Ok(views.html.userGuide.tableDrivenPropertyChecks())
  }

  def generatorDrivenPropertyChecks = Action {
    Ok(views.html.userGuide.generatorDrivenPropertyChecks())
  }

  def writingScalacheckStyleProperties = Action {
    Ok(views.html.userGuide.writingScalacheckStyleProperties())
  }

  def usingTheRunner = Action {
    Ok(views.html.userGuide.usingTheRunner())
  }

  def invokingExecute = Action {
    Ok(views.html.userGuide.invokingExecute())
  }

  def usingTheScalatestShell = Action {
    Ok(views.html.userGuide.usingTheScalatestShell())
  }

  def usingScalatestWithSbt = Action {
    Ok(views.html.userGuide.usingScalatestWithSbt())
  }

  def usingTheScalatestAntTask = Action {
    Ok(views.html.userGuide.usingTheScalatestAntTask())
  }

  def matchersQuickReference = Action {
    Ok(views.html.userGuide.matchersQuickReference())
  }

  def usingTheScalatestMavenPlugin = Action {
    Ok(views.html.userGuide.usingTheScalatestMavenPlugin())
  }

  def customizingScalatest = Action {
    Ok(views.html.userGuide.customizingScalatest())
  }

}
