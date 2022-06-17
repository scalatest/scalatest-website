package controllers

import play.api._
import play.api.mvc._
import javax.inject.Inject

class UserGuide192 @Inject() (cc: ControllerComponents) extends AbstractController(cc) {

  def userGuideIndex = Action {
    Ok(views.html.userGuide_1_9_2.userGuideIndex())
  }

  def writingYourFirstTest = Action {
    Ok(views.html.userGuide_1_9_2.writingYourFirstTest())
  }

  def usingAssertions = Action {
    Ok(views.html.userGuide_1_9_2.usingAssertions())
  }

  def taggingYourTests = Action {
    Ok(views.html.userGuide_1_9_2.taggingYourTests())
  }

  def runningYourTests = Action {
    Ok(views.html.userGuide_1_9_2.runningYourTests())
  }

  def sharingFixtures = Action {
    Ok(views.html.userGuide_1_9_2.sharingFixtures())
  }

  def sharingTests = Action {
    Ok(views.html.userGuide_1_9_2.sharingTests())
  }

  def usingMatchers = Action {
    Ok(views.html.userGuide_1_9_2.usingMatchers())
  }

  def testingWithMockObjects = Action {
    Ok(views.html.userGuide_1_9_2.testingWithMockObjects())
  }

  def testsAsSpecifications = Action {
    Ok(views.html.userGuide_1_9_2.testsAsSpecifications())
  }

  def propertyBasedTesting = Action {
    Ok(views.html.userGuide_1_9_2.propertyBasedTesting())
  }

  def otherGoodies = Action {
    Ok(views.html.userGuide_1_9_2.otherGoodies())
  }

  def philosophyAndDesign = Action {
    Ok(views.html.userGuide_1_9_2.philosophyAndDesign())
  }

  def designAndPhilosophy = Action {
    Ok(views.html.userGuide_1_9_2.designAndPhilosophy())
  }

  def selectingAStyle = Action {
    Ok(views.html.userGuide_1_9_2.selectingAStyle())
  }

  def usingJunitRunner = Action {
    Ok(views.html.userGuide_1_9_2.usingJunitRunner())
  }

  def tableDrivenPropertyChecks = Action {
    Ok(views.html.userGuide_1_9_2.tableDrivenPropertyChecks())
  }

  def generatorDrivenPropertyChecks = Action {
    Ok(views.html.userGuide_1_9_2.generatorDrivenPropertyChecks())
  }

  def writingScalacheckStyleProperties = Action {
    Ok(views.html.userGuide_1_9_2.writingScalacheckStyleProperties())
  }

  def usingTheRunner = Action {
    Ok(views.html.userGuide_1_9_2.usingTheRunner())
  }

  def usingSelenium = Action {
    Ok(views.html.userGuide_1_9_2.usingSelenium())
  }

  def invokingExecute = Action {
    Ok(views.html.userGuide_1_9_2.invokingExecute())
  }

  def usingTheScalatestShell = Action {
    Ok(views.html.userGuide_1_9_2.usingTheScalatestShell())
  }

  def usingScalatestWithSbt = Action {
    Ok(views.html.userGuide_1_9_2.usingScalatestWithSbt())
  }

  def usingTheScalatestAntTask = Action {
    Ok(views.html.userGuide_1_9_2.usingTheScalatestAntTask())
  }

  def matchersQuickReference = Action {
    Redirect(routes.Application.atAGlance("FlatSpec").url)
  }

  def usingTheScalatestMavenPlugin = Action {
    Ok(views.html.userGuide_1_9_2.usingTheScalatestMavenPlugin())
  }

  def customizingScalatest = Action {
    Ok(views.html.userGuide_1_9_2.customizingScalatest())
  }

  def usingScalatestWithEclipse = Action {
    Ok(views.html.userGuide_1_9_2.usingScalatestWithEclipse())
  }
}
