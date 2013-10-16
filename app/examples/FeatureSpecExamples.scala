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
    """<span class="stImport">import org.scalatest._</span>
      |<span class="stReserved">class</span> <span class="stType">TVSet</span> {
      |  <span class="stReserved">private</span> <span class="stReserved">var</span> on: Boolean = false
      |  <span class="stReserved">def</span> isOn: Boolean = on
      |  <span class="stReserved">def</span> pressPowerButton() { on = !on }
      |}
      |
      |<span class="stReserved">class</span> <span class="stType">TVSetSpec</span> <span class="stReserved">extends</span> <span class="stType">FeatureSpec</span> <span class="stReserved">with</span> <span class="stType">GivenWhenThen</span> {
      |  info(<span class="stLiteral">"As a TV set owner"</span>)
      |  info(<span class="stLiteral">"I want to be able to turn the TV on and off"</span>)
      |  info(<span class="stLiteral">"So I can watch TV when I want"</span>)
      |  info(<span class="stLiteral">"And save energy when I'm not watching TV"</span>)
      |
      |  feature(<span class="stLiteral">"TV power button"</span>) {
      |    scenario(<span class="stLiteral">"User presses power button when TV is off"</span>) {
      |      Given(<span class="stLiteral">"a TV set that is switched off"</span>)
      |      <span class="stReserved">val</span> tv = <span class="stReserved">new</span> <span class="stType">TVSet</span>
      |      assert(!tv.isOn)
      |      When(<span class="stLiteral">"the power button is pressed"</span>)
      |      tv.pressPowerButton()
      |      Then(<span class="stLiteral">"the TV should switch on"</span>)
      |      assert(tv.isOn)
      |    }
      |    scenario(<span class="stLiteral">"User presses power button when TV is on"</span>) {
      |      Given(<span class="stLiteral">"a TV set that is switched on"</span>)
      |      <span class="stReserved">val</span> tv = <span class="stReserved">new</span> <span class="stType">TVSet</span>
      |      tv.pressPowerButton()
      |      assert(tv.isOn)
      |      When(<span class="stLiteral">"the power button is pressed"</span>)
      |      tv.pressPowerButton()
      |      Then(<span class="stLiteral">"the TV should switch off"</span>)
      |      assert(!tv.isOn)
      |    }
      |  }
      |} """.stripMargin

  val play2Example: String =
    """<span class="stImport">import org.scalatest._</span>
      |<span class="stImport">import play.api.test._</span>
      |<span class="stImport">import play.api.test.Helpers._</span>
      |
      |<span class="stReserved">class</span> <span class="stType">ExampleSpec</span> <span class="stReserved">extends</span> <span class="stType">FeatureSpec</span> <span class="stReserved">with</span> <span class="stType">Matchers</span> {
      |  feature(<span class="stLiteral">"Application"</span>) {
      |    scenario(<span class="stLiteral">"Application should send 404 on a bad request"</span>) {
      |      running(<span class="stType">FakeApplication</span>()) {
      |        route(<span class="stType">FakeRequest</span>(GET, <span class="stLiteral">"/boum"</span>)) shouldBe None
      |      }
      |    }
      |    scenario(<span class="stLiteral">"Application should render the index page"</span>) {
      |      running(<span class="stType">FakeApplication</span>()) {
      |        <span class="stReserved">val</span> home = route(<span class="stType">FakeRequest</span>(GET, <span class="stLiteral">"/"</span>)).get
      |        status(home) shouldBe OK
      |        contentType(home) shouldBe <span class="stType">Some</span>(<span class="stLiteral">"text/html"</span>)
      |        contentAsString(home) should include (<span class="stLiteral">"ScalaTest"</span>)
      |      }
      |    }
      |  }
      |}""".stripMargin

  val doNotDiscover: String =
    """<span class="stImport">import org.scalatest._</span>
      |@DoNotDiscover
      |<span class="stReserved">class</span> <span class="stType">ExampleSpec</span> <span class="stReserved">extends</span> <span class="stType">FeatureSpec</span> { <span class="stBlockComment">/*code omitted*/</span> }
    """.stripMargin

  val ignoreTest: String =
    """<span class="stImport">import org.scalatest._</span>
      |<span class="stReserved">class</span> <span class="stType">ExampleSpec</span> <span class="stReserved">extends</span> <span class="stType">FeatureSpec</span> {
      |  ignore(<span class="stLiteral">"User presses power button when TV is off"</span>) { <span class="stBlockComment">/*code omitted*/</span> }
      |}""".stripMargin

  val pendingTest: String =
    """<span class="stImport">import org.scalatest._</span>
      |<span class="stReserved">class</span> <span class="stType">ExampleSpec</span> <span class="stReserved">extends</span> <span class="stType">FeatureSpec</span> {
      |  scenario(<span class="stLiteral">"User presses power button when TV is off"</span>) (pending)
      |}""".stripMargin

  val taggingTest: String =
    """<span class="stImport">import org.scalatest._</span>
      |<span class="stReserved">object</span> <span class="stType">SlowTest</span> <span class="stReserved">extends</span> <span class="stType">Tag</span>(<span class="stLiteral">"com.mycompany.tags.SlowTest"</span>)
      |<span class="stReserved">class</span> <span class="stType">ExampleSpec</span> <span class="stReserved">extends</span> <span class="stType">FeatureSpec</span> {
      |  scenario(<span class="stLiteral">"User presses power button when TV is off"</span>, <span class="stType">SlowTest</span>) {
      |    <span class="stBlockComment">/*code omitted*/</span>
      |  }
      |}""".stripMargin

  val infoTest: String =
    """<span class="stImport">import org.scalatest._</span>
      |<span class="stReserved">class</span> <span class="stType">ExampleSpec</span> <span class="stReserved">extends</span> <span class="stType">FeatureSpec</span> {
      |  scenario(<span class="stLiteral">"User presses power button when TV is off"</span>) {
      |    info(<span class="stLiteral">"Some information."</span>)
      |    <span class="stBlockComment">/*code omitted*/</span>
      |  }
      |}""".stripMargin

  val fixtureNoArgTest: String =
    """<span class="stImport">import org.scalatest._</span>
      |<span class="stReserved">class</span> <span class="stType">ExampleSpec</span> <span class="stReserved">extends</span> <span class="stType">FeatureSpec</span> {
      |  <span class="stReserved">def</span> setup() { <span class="stBlockComment">/*code omitted*/</span> }
      |  <span class="stReserved">def</span> cleanup() { <span class="stBlockComment">/*code omitted*/</span> }
      |  <span class="stReserved">override</span> <span class="stReserved">protected</span> <span class="stReserved">def</span> withFixture(test: <span class="stType">NoArgTest</span>) = {
      |    setup()
      |    <span class="stReserved">try</span> test() <span class="stReserved">finally</span> cleanup()
      |  }
      |}""".stripMargin

  val fixtureOneArgTest: String =
    """<span class="stImport">import org.scalatest._</span>
      |<span class="stReserved">class</span> <span class="stType">ExampleSpec</span> <span class="stReserved">extends</span> <span class="stType">fixture.FeatureSpec</span> {
      |  <span class="stReserved">def</span> setup() { <span class="stBlockComment">/*code omitted*/</span> }
      |  <span class="stReserved">def</span> cleanup() { <span class="stBlockComment">/*code omitted*/</span> }
      |  <span class="stReserved">type</span> FixtureParam = <span class="stType">String</span>
      |  <span class="stReserved">override</span> <span class="stReserved">protected</span> <span class="stReserved">def</span> withFixture(test: <span class="stType">OneArgTest</span>) = {
      |    setup()
      |    <span class="stReserved">try</span> test(<span class="stLiteral">"this is a fixture param"</span>) <span class="stReserved">finally</span> cleanup()
      |  }
      |}""".stripMargin

  val seleniumExample: String =
    """<span class="stImport">import org.scalatest._
      |import selenium._
      |import org.openqa.selenium._
      |import htmlunit._</span>
      |<span class="stReserved">class</span> <span class="stType">BlogSpec</span> <span class="stReserved">extends</span> <span class="stType">FeatureSpec</span> <span class="stReserved">with</span> <span class="stType">WebBrowser</span> {
      |  <span class="stReserved">implicit</span> <span class="stReserved">val</span> webDriver: <span class="stType">WebDriver</span> = <span class="stReserved">new</span> <span class="stType">HtmlUnitDriver</span>
      |  <span class="stReserved">val</span> host = <span class="stLiteral">"http://localhost:9000/"</span>
      |  scenario(<span class="stLiteral">"The blog app home page should have the correct title"</span>) {
      |    go to (host + <span class="stLiteral">"index.html"</span>)
      |    pageTitle should be (<span class="stLiteral">"Awesome Blog"</span>)
      |  }
      |}""".stripMargin
}