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

object SpecExamples extends StyleTraitExamples {

  val name: String = "Spec"

  val exampleUsage: String =
    """<span class="stReserved">import</span> org.scalatest.<span class="stType">Spec</span>
      |<span class="stReserved">class</span> <span class="stType">SetSpec</span> <span class="stReserved">extends</span> <span class="stType">Spec</span> {
      |  <span class="stReserved">object</span> `A Set` {
      |    <span class="stReserved">object</span> `when empty` {
      |      <span class="stReserved">def</span> `should have size 0` { assert(<span class="stType">Set</span>.empty.size === <span class="stLiteral">0</span>) }
      |      <span class="stReserved">def</span> `should produce NoSuchElementException when head is invoked` {
      |        intercept[<span class="stType">NoSuchElementException</span>] { <span class="stType">Set</span>.empty.head }
      |      }
      |    }
      |  }
      |} """.stripMargin

  val play2Example: String =
    """<span class="stReserved">import</span> org.scalatest._
      |<span class="stReserved">import</span> play.api.test._
      |<span class="stReserved">import</span> play.api.test.<span class="stType">Helpers</span>._
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
    """<span class="stReserved">import</span> org.scalatest._
      |@DoNotDiscover
      |<span class="stReserved">class</span> <span class="stType">SetSpec</span> <span class="stReserved">extends</span> <span class="stType">Spec</span> { ... }
    """.stripMargin

  val ignoreTest: String =
    "@Ignore <span class=\"stReserved\">def</span> `should have size 0` { ... }"

  val pendingTest: String =
    "<span class=\"stReserved\">def</span> `should have size 0` { pending }"

  val taggingTest: String =
    """// SlowTest is a Java annotation
      |@SlowTest <span class="stReserved">def</span> `should have size 0` { ... }
      |""".stripMargin
}