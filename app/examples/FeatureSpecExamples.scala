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
package examples

object FeatureSpecExamples extends StyleTraitExamples {

  val name: String = "FeatureSpec"

  val exampleUsage: String =
    """<span class="stReserved">import</span> org.scalatest._
      |<span class="stReserved">class</span> TVSet {
      |  <span class="stReserved">private</span> <span class="stReserved">var</span> on: Boolean = false
      |  <span class="stReserved">def</span> isOn: Boolean = on
      |  <span class="stReserved">def</span> pressPowerButton() { on = !on }
      |}
      |
      |<span class="stReserved">class</span> TVSetSpec <span class="stReserved">extends</span> FeatureSpec <span class="stReserved">with</span> GivenWhenThen {
      |  info("As a TV set owner")
      |  info("I want to be able to turn the TV on and off")
      |  info("So I can watch TV when I want")
      |  info("And save energy when I'm not watching TV")
      |
      |  feature("TV power button") {
      |    scenario("User presses power button when TV is off") {
      |      Given("a TV set that is switched off")
      |      <span class="stReserved">val</span> tv = <span class="stReserved">new</span> TVSet
      |      assert(!tv.isOn)
      |      When("the power button is pressed")
      |      tv.pressPowerButton()
      |      Then("the TV should switch on")
      |      assert(tv.isOn)
      |    }
      |    scenario("User presses power button when TV is on") {
      |      Given("a TV set that is switched on")
      |      <span class="stReserved">val</span> tv = <span class="stReserved">new</span> TVSet
      |      tv.pressPowerButton()
      |      assert(tv.isOn)
      |      When("the power button is pressed")
      |      tv.pressPowerButton()
      |      Then("the TV should switch off")
      |      assert(!tv.isOn)
      |    }
      |  }
      |} """.stripMargin

  val play2Example: String =
    """<span class="stReserved">import</span> org.scalatest._
      |<span class="stReserved">import</span> play.api.test._
      |<span class="stReserved">import</span> play.api.test.Helpers._
      |
      |<span class="stReserved">class</span> ExampleSpec <span class="stReserved">extends</span> FeatureSpec <span class="stReserved">with</span> Matchers {
      |  feature("Application") {
      |    scenario("Application should send 404 on a bad request") {
      |      running(FakeApplication()) {
      |        route(FakeRequest(GET, "/boum")) shouldBe None
      |      }
      |    }
      |    scenario("Application should render the index page") {
      |      running(FakeApplication()) {
      |        <span class="stReserved">val</span> home = route(FakeRequest(GET, "/")).get
      |        status(home) shouldBe OK
      |        contentType(home) shouldBe Some("text/html")
      |        contentAsString(home) should include ("ScalaTest")
      |      }
      |    }
      |  }
      |}""".stripMargin

  val doNotDiscover: String =
    """<span class="stReserved">import</span> org.scalatest._
      |@DoNotDiscover
      |<span class="stReserved">class</span> TVSetSpec <span class="stReserved">extends</span> FeatureSpec <span class="stReserved">with</span> GivenWhenThen { ... }
    """.stripMargin

  val ignoreTest: String =
    "ignore(\"User presses power button when TV is off\") { ... }"

  val pendingTest: String =
    "scenario(\"User presses power button when TV is off\") (pending)"

  val taggingTest: String =
    """object SlowTest extends Tag("com.mycompany.tags.SlowTest")
      |scenario("User presses power button when TV is off", SlowTest) { ... }
      |""".stripMargin

}