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

object WordSpecExamples extends StyleTraitExamples {

  val name: String = "WordSpec"

  val exampleUsage: String =
    """<span class="stReserved">import</span> org.scalatest.<span class="stType">WordSpec</span>
      |<span class="stReserved">class</span> <span class="stType">SetSpec</span> <span class="stReserved">extends</span> <span class="stType">WordSpec</span> {
      |  <span class="stLiteral">"A Set"</span> when {
      |    <span class="stLiteral">"empty"</span> should {
      |      <span class="stLiteral">"have size 0"</span> in {
      |        assert(<span class="stType">Set</span>.empty.size === <span class="stLiteral">0</span>)
      |      }
      |      <span class="stLiteral">"produce NoSuchElementException when head is invoked"</span> in {
      |        intercept[<span class="stType">NoSuchElementException</span>] {
      |          <span class="stType">Set</span>.empty.head
      |        }
      |      }
      |    }
      |  }
      |}""".stripMargin

  val play2Example: String =
    """<span class="stReserved">import</span> org.scalatest._
      |<span class="stReserved">import</span> play.api.test._
      |<span class="stReserved">import</span> play.api.test.<span class="stType">Helpers</span>._
      |
      |<span class="stReserved">class</span> <span class="stType">ExampleSpec</span> <span class="stReserved">extends</span> <span class="stType">WordSpec</span> <span class="stReserved">with</span> <span class="stType">Matchers</span> {
      |  <span class="stLiteral">"Application"</span> should {
      |    <span class="stLiteral">"send 404 on a bad request"</span> in running(<span class="stType">FakeApplication</span>()) {
      |      route(<span class="stType">FakeRequest</span>(GET, <span class="stLiteral">"/boum"</span>)) shouldBe <span class="stType">None</span>
      |    }
      |    <span class="stLiteral">"render the index page"</span> in running(<span class="stType">FakeApplication</span>()) {
      |      <span class="stReserverd">val</span> home = route(<span class="stType">FakeRequest</span>(GET, <span class="stLiteral">"/"</span>)).get
      |      status(home) shouldBe OK
      |      contentType(home) shouldBe <span class="stType">Some</span>(<span class="stLiteral">"text/html"</span>)
      |      contentAsString(home) should include (<span class="stLiteral">"ScalaTest"</span>)
      |    }
      |  }
      |}""".stripMargin

  val doNotDiscover: String =
    """<span class="stReserved">import</span> org.scalatest._
      |@DoNotDiscover
      |<span class="stReserved">class</span> <span class="stType">SetSpec</span> <span class="stReserved">extends</span> <span class="stType">WordSpec</span> { ... }
    """.stripMargin

  val ignoreTest: String =
    "<span class=\"stLiteral\">\"have size 0\"</span> ignore { ... }"

  val pendingTest: String =
    "<span class=\"stLiteral\">\"have size 0\"</span> in (pending)"

  val taggingTest: String =
    """<span class="stReserved">object</span> <span class="stType">SlowTest</span> <span class="stReserved">extends</span> <span class="stType">Tag</span>(<span class="stLiteral">"com.mycompany.tags.SlowTest"</span>)
      |<span class="stLiteral">"have size 0"</span> taggedAs(<span class="stType">SlowTest</span>) in { ... }
      |""".stripMargin
}