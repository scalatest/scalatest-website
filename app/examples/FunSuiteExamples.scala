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

object FunSuiteExamples extends StyleTraitExamples {

  val name: String = "FunSuite"

  val description: String = """For teams coming from xUnit, FunSuite feels comfortable and familiar while still giving some of the benefits of BDD: FunSuite makes it easy to write descriptive test names, natural to write focused tests, and generates specification-like output that can facilitate communication among stakeholders."""

  val exampleUsage: String =
    """<span class="stImport">import org.scalatest.FunSuite</span>
      |<span class="stReserved">class</span> <span class="stType">SetSuite</span> <span class="stReserved">extends</span> <span class="stType">FunSuite</span> {
      |  test(<span class="stLiteral">"An empty Set should have size 0"</span>) { assert(<span class="stType">Set</span>.empty.size === <span class="stLiteral">0</span>) }
      |  test(<span class="stLiteral">"Invoking head on an empty Set should produce NoSuchElementException"</span>) {
      |    intercept[<span class="stType">NoSuchElementException</span>] { <span class="stType">Set</span>.empty.head }
      |  }
      |} """.stripMargin

  val play2Example: String =
    """<span class="stImport">import org.scalatest._</span>
      |<span class="stImport">import play.api.test._</span>
      |<span class="stImport">import play.api.test.Helpers._</span>
      |
      |<span class="stReserved">class</span> <span class="stType">ExampleSpec</span> <span class="stReserved">extends</span> <span class="stType">FunSuite</span> <span class="stReserved">with</span> <span class="stType">Matchers</span> {
      |  test(<span class="stLiteral">"Application should send 404 on a bad request"</span>)  {
      |    running(<span class="stType">FakeApplication</span>()) { route(<span class="stType">FakeRequest</span>(GET, "/boum")) shouldBe <span class="stType">None</span> }
      |  }
      |  test(<span class="stLiteral">"Application should send render the index page"</span>) {
      |    running(<span class="stType">FakeApplication</span>()) {
      |      <span class="stReserved">val</span> home = route(<span class="stType">FakeRequest</span>(GET, <span class="stLiteral">"/"</span>)).get
      |      status(home) shouldBe OK
      |      contentType(home) shouldBe <span class="stType">Some</span>(<span class="stLiteral">"text/html"</span>)
      |      contentAsString(home) should include (<span class="stLiteral">"ScalaTest"</span>)
      |    }
      |  }
      |}""".stripMargin

  val doNotDiscover: String =
    """<span class="stImport">import org.scalatest._</span>
      |@DoNotDiscover
      |<span class="stReserved">class</span> <span class="stType">SetSuite</span> <span class="stReserved">extends</span> <span class="stType">FunSuite</span> { <span class="stBlockComment">/*code omitted*/</span> }
    """.stripMargin

  val ignoreTest: String =
    """<span class="stImport">import org.scalatest._</span>
      |<span class="stReserved">class</span> <span class="stType">SetSuite</span> <span class="stReserved">extends</span> <span class="stType">FunSuite</span> {
      |  ignore(<span class="stLiteral">"An empty Set should have size 0"</span>) { <span class="stBlockComment">/*code omitted*/</span> }
      |}""".stripMargin

  val pendingTest: String =
    """<span class="stImport">import org.scalatest._</span>
      |<span class="stReserved">class</span> <span class="stType">SetSuite</span> <span class="stReserved">extends</span> <span class="stType">FunSuite</span> {
      |  test(<span class="stLiteral">"An empty Set should have size 0"</span>) (pending)
      |}""".stripMargin

  val taggingTest: String =
    """<span class="stImport">import org.scalatest._</span>
      |<span class="stReserved">object</span> <span class="stType">SlowTest</span> <span class="stReserved">extends</span> <span class="stType">Tag</span>(<span class="stLiteral">"com.mycompany.tags.SlowTest"</span>)
      |<span class="stReserved">class</span> <span class="stType">SetSuite</span> <span class="stReserved">extends</span> <span class="stType">FunSuite</span> {
      |  test(<span class="stLiteral">"An empty Set should have size 0"</span>, <span class="stType">SlowTest</span>) {
      |    <span class="stBlockComment">/*code omitted*/</span>
      |  }
      |}""".stripMargin

  val infoTest: String =
    """<span class="stImport">import org.scalatest._</span>
      |<span class="stReserved">class</span> <span class="stType">SetSuite</span> <span class="stReserved">extends</span> <span class="stType">FunSuite</span> {
      |  test(<span class="stLiteral">"An empty Set should have size 0"</span>) {
      |    info(<span class="stLiteral">"Some information."</span>)
      |    <span class="stBlockComment">/*code omitted*/</span>
      |  }
      |}""".stripMargin

  val fixtureNoArgTest: String =
    """<span class="stImport">import org.scalatest._</span>
      |<span class="stReserved">class</span> <span class="stType">SetSuite</span> <span class="stReserved">extends</span> <span class="stType">FunSuite</span> {
      |  <span class="stReserved">def</span> setup() { <span class="stBlockComment">/*code omitted*/</span> }
      |  <span class="stReserved">def</span> cleanup() { <span class="stBlockComment">/*code omitted*/</span> }
      |  <span class="stReserved">override</span> <span class="stReserved">protected</span> <span class="stReserved">def</span> withFixture(test: <span class="stType">NoArgTest</span>) = {
      |    setup()
      |    <span class="stReserved">try</span> test() <span class="stReserved">finally</span> cleanup()
      |  }
      |}""".stripMargin

  val fixtureOneArgTest: String =
    """<span class="stImport">import org.scalatest._</span>
      |<span class="stReserved">class</span> <span class="stType">SetSuite</span> <span class="stReserved">extends</span> <span class="stType">fixture.FunSuite</span> {
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
      |import selenium._</span>
      |<span class="stReserved">class</span> <span class="stType">BlogSpec</span> <span class="stReserved">extends</span> <span class="stType">FunSuite</span> <span class="stReserved">with</span> <span class="stType">WebBrowser</span> <span class="stReserved">with</span> <span class="stType">HtmlUnit</span> {
      |  <span class="stReserved">val</span> host = <span class="stLiteral">"http://localhost:9000/"</span>
      |  test(<span class="stLiteral">"The blog app home page should have the correct title"</span>) {
      |    go to (host + <span class="stLiteral">"index.html"</span>)
      |    pageTitle should be (<span class="stLiteral">"Awesome Blog"</span>)
      |  }
      |}""".stripMargin
}
