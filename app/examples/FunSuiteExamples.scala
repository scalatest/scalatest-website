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
      |<span class="stReserved">class</span> <span class="stType">SetSuite</span> <span class="stReserved">extends</span> <span class="stType">FunSuite</span> { ... }
    """.stripMargin

  val ignoreTest: String =
    "ignore(<span class=\"stLiteral\">\"An empty Set should have size 0\"</span>) { ... }"

  val pendingTest: String =
    "test(<span class=\"stLiteral\">\"An empty Set should have size 0\"</span>) (pending)"

  val taggingTest: String =
    """<span class="stReserved">object</span> <span class="stType">SlowTest</span> <span class="stReserved">extends</span> <span class="stType">Tag</span>(<span class="stLiteral">"com.mycompany.tags.SlowTest"</span>)
      |test(<span class="stLiteral">"An empty Set should have size 0"</span>, <span class="stType">SlowTest</span>) { ... }
      |""".stripMargin
}