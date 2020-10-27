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

class UserGuide extends Controller {

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

  def definingBaseClasses = Action {
    Ok(views.html.userGuide.definingBaseClasses())
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
    Redirect(routes.Application.atAGlance("FlatSpec").url)
  }

  def usingTheScalatestMavenPlugin = Action {
    Ok(views.html.userGuide.usingTheScalatestMavenPlugin())
  }

  def customizingScalatest = Action {
    Ok(views.html.userGuide.customizingScalatest())
  }

  def usingScalatestWithEclipse = Action {
    Ok(views.html.userGuide.usingScalatestWithEclipse())
  }

  def migratingTo20 = Action {
    Ok(views.html.userGuide.migratingTo20())
  }

  def migratingTo30 = Action {
    Ok(views.html.userGuide.migratingTo30())
  }

  def usingScalatestWithIntelliJ = Action {
    Ok(views.html.userGuide.usingScalaTestWithIntelliJ())
  }

  def asyncTesting = Action {
    Ok(views.html.userGuide.asyncTesting())
  }

  def usingScalaJS = Action {
    Ok(views.html.userGuide.usingScalaJS())
  }

  def usingInside = Action {
    Ok(views.html.userGuide.usingInside())
  }

  def usingOptionValues = Action {
    Ok(views.html.userGuide.usingOptionValues())
  }

  def usingEitherValues = Action {
    Ok(views.html.userGuide.usingEitherValues())
  }

  def usingPartialFunctionValues = Action {
    Ok(views.html.userGuide.usingPartialFunctionValues())
  }

  def usingPrivateMethodTester = Action {
    Ok(views.html.userGuide.usingPrivateMethodTester())
  }

  def usingWrapWith = Action {
    Ok(views.html.userGuide.usingWrapWith())
  }


}

