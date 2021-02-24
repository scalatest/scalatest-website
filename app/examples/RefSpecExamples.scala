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

object RefSpecExamples extends StyleTraitExamples {

  val name: String = "RefSpec"

  val description: String = """RefSpec allows you to define tests as methods, which saves one function literal per test compared to style classes that represent tests as functions. Fewer function literals translates into faster compile times and fewer generated class files, which can help minimize build times. As a result, using Spec can be a good choice in large projects where build times are a concern as well as when generating large numbers of tests programatically via static code generators."""

  val exampleUsage: String =
    """<span class="stImport">import org.scalatest._</span>
      |<span class="stImport">import refspec._</span>
      |
      |<span class="stReserved">class</span> <span class="stType">SetSpec</span> <span class="stReserved">extends</span> <span class="stType">RefSpec</span> {
      |  <span class="stReserved">override</span> <span class="stReserved">def</span> withFixture(test: <span class="stType">NoArgTest</span>) = { <span class="stExplain">// Define a shared fixture</span>
      |    <span class="stExplain">// Shared setup (run at beginning of each test)</span>
      |    <span class="stReserved">try</span> test()
      |    <span class="stReserved">finally</span> {
      |      <span class="stExplain">// Shared cleanup (run at end of each test)</span>
      |    }
      |  }
      |
      |  <span class="stExplain">// Describe a <em>scope</em> for a <em>subject</em>, in this case: "A Set"</span>
      |  <span class="stReserved">object</span> <span class="stLiteral">`A Set`</span> { <span class="stExplain">// All tests within these curly braces are about "A Set"</span>
      |
      |    <span class="stExplain">// Can describe nested scopes that "narrow" its outer scopes</span>
      |    <span class="stReserved">object</span> <span class="stLiteral">`(when empty)`</span> { <span class="stExplain">// All tests within these curly braces are about "A Set (when empty)"</span>
      |
      |      <span class="stReserved">def</span> <span class="stLiteral">`should have size 0`</span> = {    <span class="stExplain">// Here, 'it' refers to "A Set (when empty)". The full name</span>
      |        assert(<span class="stType">Set</span>.empty.size == <span class="stLiteral">0</span>) <span class="stExplain">// of this test is: "A Set (when empty) should have size 0"</span>
      |      }
      |      <span class="stReserved">def</span> <span class="stLiteral">`should produce NoSuchElementException when head is invoked`</span> = { // <span class="stExplain">Define another test</span>
      |        intercept[<span class="stType">NoSuchElementException</span>] {
      |          <span class="stType">Set</span>.empty.head
      |        }
      |      }
      |      @<span class="stType">Ignore<span> <span class="stReserved">def</span> <span class="stLiteral">`should should be empty`</span> = { <span class="stExplain">// To ignore a test, change 'it' to 'ignore'...</span>
      |        assert(<span class="stType">Set</span>.empty.isEmpty)
      |      }
      |    }
      |
      |    <span class="stExplain">// Describe a second nested scope that narrows "A Set" in a different way</span>
      |    <span class="stReserved">object</span> <span class="stLiteral">`(when non-empty)`</span> { <span class="stExplain">// All tests within these curly braces are about "A Set (when non-empty)"</span>
      |
      |      <span class="stReserved">def</span> <span class="stLiteral">`should have the correct size`</span> = { <span class="stExplain">// Here, 'it' refers to "A Set (when non-empty)". This test's full</span>
      |        assert(<span class="stType">Set</span>(<span class="stLiteral">1</span>, <span class="stLiteral">2</span>, <span class="stLiteral">3</span>).size == <span class="stLiteral">3</span>)     <span class="stExplain">// name is: "A Set (when non-empty) should have the correct size"</span>
      |      }
      |      <span class="stExplain">// Define a pending test by using { pending } for the body</span>
      |      <span class="stReserved">def</span> <span class="stLiteral">`return a contained value when head is invoked`</span> = { pending }
      |      <span class="stImport">import org.scalatest.tags.Slow</span>
      |      @<span class="stType">Slow<span> <span class="stReserved">def</span> <span class="stLiteral">`should be non-empty`</span> = { <span class="stExplain">// Tag a test by placing a tag object after the test name</span>
      |        assert(<span class="stType">Set</span>(<span class="stLiteral">1</span>, <span class="stLiteral">2</span>, <span class="stLiteral">3</span>).nonEmpty)
      |      }
      |    }
      |  }
      |}
      |
      |@DoNotDiscover <span class="stExplain">// Disable discovery of a test class</span>
      |<span class="stReserved">class</span> <span class="stType">InvisibleSpec</span> <span class="stReserved">extends</span> <span class="stType">RefSpec</span> { <span class="stBlockComment">/*code omitted*/</span> }
      |
      |@Ignore <span class="stExplain">// Ignore all tests in a test class</span>
      |<span class="stReserved">class</span> <span class="stType">IgnoredSpec</span> <span class="stReserved">extends</span> <span class="stType">RefSpec</span> { <span class="stBlockComment">/*code omitted*/</span> }
      |
      |<span class="stImport">import tags.Slow</span>
      |@Slow <span class="stExplain">// Mark all tests in a test class with a tag</span>
      |<span class="stReserved">class</span> <span class="stType">SlowSpec</span> <span class="stReserved">extends</span> <span class="stType">RefSpec</span> { <span class="stBlockComment">/*code omitted*/</span> }
      |""".stripMargin

  val play2Example: String =
    """<span class="stImport">import org.scalatest._</span>
      |<span class="stImport">import play.api.test._</span>
      |<span class="stImport">import play.api.test.Helpers._</span>
      |
      |<span class="stReserved">class</span> <span class="stType">ExampleSpec</span> <span class="stReserved">extends</span> <span class="stType">Spec</span> <span class="stReserved">with</span> <span class="stType">Matchers</span> {
      |  <span class="stReserved">object</span> `Application should` {
      |    <span class="stReserved">def</span> `send 404 on a bad request` {
      |      running(<span class="stType">FakeApplication</span>()) {
      |        route(<span class="stType">FakeRequest</span>(GET, <span class="stLiteral">"/boum"</span>)) shouldBe <span class="stType">None</span>
      |      }
      |    }
      |    <span class="stReserved">def</span> `render the index page` {
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
      |<span class="stReserved">class</span> <span class="stType">SetSpec</span> <span class="stReserved">extends</span> <span class="stType">Spec</span> { <span class="stBlockComment">/*code omitted*/</span> }
    """.stripMargin

  val ignoreTest: String =
    """<span class="stImport">import org.scalatest._</span>
      |<span class="stReserved">class</span> <span class="stType">SetSpec</span> <span class="stReserved">extends</span> <span class="stType">Spec</span> {
      |  @Ignore <span class="stReserved">def</span> `should have size 0` { <span class="stBlockComment">/*code omitted*/</span> }
      |}""".stripMargin

  val pendingTest: String =
    """<span class="stImport">import org.scalatest._</span>
      |<span class="stReserved">class</span> <span class="stType">SetSpec</span> <span class="stReserved">extends</span> <span class="stType">Spec</span> {
      |  <span class="stReserved">def</span> `should have size 0` { pending }
      |}""".stripMargin

  val taggingTest: String =
    """<span class="stImport">import org.scalatest._
      |import tags.Retryable</span>
      |<span class="stReserved">class</span> <span class="stType">SetSpec</span> <span class="stReserved">extends</span> <span class="stType">Spec</span> {
      |  @Retryable <span class="stReserved">def</span> `should have size 0` { <span class="stBlockComment">/*code omitted*/</span> }
      |}""".stripMargin

  val infoTest: String =
    """<span class="stImport">import org.scalatest._</span>
      |<span class="stReserved">class</span> <span class="stType">SetSpec</span> <span class="stReserved">extends</span> <span class="stType">Spec</span> {
      |  <span class="stReserved">def</span> `should have size 0` {
      |    info(<span class="stLiteral">"Some information."</span>)
      |    <span class="stBlockComment">/*code omitted*/</span>
      |  }
      |}""".stripMargin

  val fixtureNoArgTest: String =
    """<span class="stImport">import org.scalatest._</span>
      |<span class="stReserved">class</span> <span class="stType">SetSpec</span> <span class="stReserved">extends</span> <span class="stType">Spec</span> {
      |  <span class="stReserved">def</span> setup() { <span class="stBlockComment">/*code omitted*/</span> }
      |  <span class="stReserved">def</span> cleanup() { <span class="stBlockComment">/*code omitted*/</span> }
      |  <span class="stReserved">override</span> <span class="stReserved">protected</span> <span class="stReserved">def</span> withFixture(test: <span class="stType">NoArgTest</span>) = {
      |    setup()
      |    <span class="stReserved">try</span> test() <span class="stReserved">finally</span> cleanup()
      |  }
      |}""".stripMargin

  val fixtureOneArgTest: String =
    """<span class="stImport">import org.scalatest._</span>
      |<span class="stReserved">class</span> <span class="stType">SetSpec</span> <span class="stReserved">extends</span> <span class="stType">fixture.Spec</span> {
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
      |<span class="stReserved">class</span> <span class="stType">BlogSpec</span> <span class="stReserved">extends</span> <span class="stType">Spec</span> <span class="stReserved">with</span> <span class="stType">WebBrowser</span> <span class="stReserved">with</span> <span class="stType">HtmlUnit</span> {
      |  <span class="stReserved">val</span> host = <span class="stLiteral">"http://localhost:9000/"</span>
      |  <span class="stReserved">def</span> `The blog app home page should have the correct title` {
      |    go to (host + <span class="stLiteral">"index.html"</span>)
      |    pageTitle should be (<span class="stLiteral">"Awesome Blog"</span>)
      |  }
      |}""".stripMargin
}
