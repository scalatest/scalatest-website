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

object PropSpecExamples extends StyleTraitExamples {

  val name: String = "PropSpec"

  val exampleUsage: String =
    """<span class="stImport">import org.scalatest._</span>
      |<span class="stImport">import prop._</span>
      |<span class="stImport">import scala.collection.immutable._</span>
      |<span class="stReserved">class</span> <span class="stType">SetSpec</span> <span class="stReserved">extends</span> <span class="stType">PropSpec</span> <span class="stReserved">with</span> <span class="stType">TableDrivenPropertyChecks</span> <span class="stReserved">with</span> <span class="stType">Matchers</span> {
      |  <span class="stReserved">val</span> examples =
      |    <span class="stType">Table</span>("set",
      |          <span class="stType">BitSet</span>.empty,
      |          <span class="stType">HashSet</span>.empty[<span class="stType">Int</span>],
      |          <span class="stType">TreeSet</span>.empty[<span class="stType">Int</span>])
      |  property(<span class="stLiteral">"an empty Set should have size 0"</span>) {
      |    forAll(examples) { set => set.size should be (<span class="stLiteral">0</span>) }
      |  }
      |  property(<span class="stLiteral">"invoke head on an empty set should produce NoSuchElementException"</span>) {
      |    forAll(examples) {
      |      set => evaluating { set.head } should produce [<span class="stType">NoSuchElementException</span>]
      |    }
      |  }
      |} """.stripMargin

  val play2Example: String =
    """<span class="stImport">import org.scalatest._</span>
      |<span class="stImport">import play.api.test._</span>
      |<span class="stImport">import play.api.test.Helpers._</span>
      |
      |<span class="stReserved">class</span> <span class="stType">ExampleSpec</span> <span class="stReserved">extends</span> <span class="stType">PropSpec</span> <span class="stReserved">with</span> <span class="stType">Matchers</span> {
      |  property(<span class="stLiteral">"Application should send 404 on a bad request"</span>) {
      |    running(<span class="stType">FakeApplication</span>()) {
      |      route(<span class="stType">FakeRequest</span>(GET, <span class="stLiteral">"/boum"</span>)) shouldBe <span class="stType">None</span>
      |    }
      |  }
      |  property(<span class="stLiteral">"Application should render the index page"</span>) {
      |    running(<span class="stType">FakeApplication</span>()) {
      |      <span class="stReserved">val</span> home = route(<span class="stType">FakeRequest</span>(GET, <span class="stLiteral">"/"</span>)).get
      |      status(home) shouldBe OK
      |      contentType(home) shouldBe <span class="stType">Some</span>(<span class="stLiteral">"text/html"</span>)
      |      contentAsString(home) should include (<span class="stLiteral">"ScalaTest"</span>)
      |    }
      |  }
      |}""".stripMargin

  val doNotDiscover: String =
    """<span class="stImport">import org.scalatest._
      |import prop._</span>
      |@DoNotDiscover
      |<span class="stReserved">class</span> <span class="stType">SetSpec</span> <span class="stReserved">extends</span> <span class="stType">PropSpec</span> <span class="stReserved">with</span>
      |  <span class="stType">TableDrivenPropertyChecks</span> <span class="stReserved">with</span> <span class="stType">Matchers</span> { <span class="stBlockComment">/*code omitted*/</span> }
    """.stripMargin

  val ignoreTest: String =
    """<span class="stImport">import org.scalatest._
      |import prop._</span>
      |<span class="stReserved">class</span> <span class="stType">SetSpec</span> <span class="stReserved">extends</span> <span class="stType">PropSpec</span> <span class="stReserved">with</span>
      |  <span class="stType">TableDrivenPropertyChecks</span> <span class="stReserved">with</span> <span class="stType">Matchers</span> {
      |  ignore(<span class="stLiteral">"an empty Set should have size 0"</span>) { <span class="stBlockComment">/*code omitted*/</span> }
      |}""".stripMargin

  val pendingTest: String =
    """<span class="stImport">import org.scalatest._
      |import prop._</span>
      |<span class="stReserved">class</span> <span class="stType">SetSpec</span> <span class="stReserved">extends</span> <span class="stType">PropSpec</span> <span class="stReserved">with</span>
      |  <span class="stType">TableDrivenPropertyChecks</span> <span class="stReserved">with</span> <span class="stType">Matchers</span> {
      |  property(<span class="stLiteral">"an empty Set should have size 0"</span>) (pending)
      |}""".stripMargin

  val taggingTest: String =
    """<span class="stImport">import org.scalatest._
      |import prop._</span>
      |<span class="stReserved">object</span> <span class="stType">SlowTest</span> <span class="stReserved">extends</span> <span class="stType">Tag</span>(<span class="stLiteral">"com.mycompany.tags.SlowTest"</span>)
      |<span class="stReserved">class</span> <span class="stType">SetSpec</span> <span class="stReserved">extends</span> <span class="stType">PropSpec</span> <span class="stReserved">with</span>
      |  <span class="stType">TableDrivenPropertyChecks</span> <span class="stReserved">with</span> <span class="stType">Matchers</span> {
      |  property(<span class="stLiteral">"an empty Set should have size 0"</span>, <span class="stType">SlowTest</span>) {
      |    <span class="stBlockComment">/*code omitted*/</span>
      |  }
      |}""".stripMargin

  val infoTest: String =
    """<span class="stImport">import org.scalatest._
      |import prop._</span>
      |<span class="stReserved">class</span> <span class="stType">SetSpec</span> <span class="stReserved">extends</span> <span class="stType">PropSpec</span> <span class="stReserved">with</span>
      |  <span class="stType">TableDrivenPropertyChecks</span> <span class="stReserved">with</span> <span class="stType">Matchers</span> {
      |  property(<span class="stLiteral">"an empty Set should have size 0"</span>) {
      |    info(<span class="stLiteral">"Some information."</span>)
      |    <span class="stBlockComment">/*code omitted*/</span>
      |  }
      |}""".stripMargin

  val fixtureNoArgTest: String =
    """<span class="stImport">import org.scalatest._
      |import prop._</span>
      |<span class="stReserved">class</span> <span class="stType">SetSpec</span> <span class="stReserved">extends</span> <span class="stType">PropSpec</span> <span class="stReserved">with</span>
      |  <span class="stType">TableDrivenPropertyChecks</span> <span class="stReserved">with</span> <span class="stType">Matchers</span> {
      |  <span class="stReserved">def</span> setup() { <span class="stBlockComment">/*code omitted*/</span> }
      |  <span class="stReserved">def</span> cleanup() { <span class="stBlockComment">/*code omitted*/</span> }
      |  <span class="stReserved">override</span> <span class="stReserved">protected</span> <span class="stReserved">def</span> withFixture(test: <span class="stType">NoArgTest</span>) = {
      |    setup()
      |    <span class="stReserved">try</span> test() <span class="stReserved">finally</span> cleanup()
      |  }
      |}""".stripMargin

  val fixtureOneArgTest: String =
    """<span class="stImport">import org.scalatest._
      |import prop._</span>
      |<span class="stReserved">class</span> <span class="stType">SetSpec</span> <span class="stReserved">extends</span> <span class="stType">fixture.PropSpec</span> <span class="stReserved">with</span>
      |  <span class="stType">TableDrivenPropertyChecks</span> <span class="stReserved">with</span> <span class="stType">Matchers</span> {
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
      |import prop._
      |import selenium._
      |import org.openqa.selenium._
      |import htmlunit._</span>
      |<span class="stReserved">class</span> <span class="stType">BlogSpec</span> <span class="stReserved">extends</span> <span class="stType">PropSpec</span> <span class="stReserved">with</span>
      |  <span class="stType">TableDrivenPropertyChecks</span> <span class="stReserved">with</span> <span class="stType">Matchers</span> <span class="stReserved">with</span> <span class="stType">WebBrowser</span> {
      |  <span class="stReserved">implicit</span> <span class="stReserved">val</span> webDriver: <span class="stType">WebDriver</span> = <span class="stReserved">new</span> <span class="stType">HtmlUnitDriver</span>
      |  <span class="stReserved">val</span> host = <span class="stLiteral">"http://localhost:9000/"</span>
      |  property(<span class="stLiteral">"The blog app home page should have the correct title"</span>) {
      |    go to (host + <span class="stLiteral">"index.html"</span>)
      |    pageTitle should be (<span class="stLiteral">"Awesome Blog"</span>)
      |  }
      |}""".stripMargin
}