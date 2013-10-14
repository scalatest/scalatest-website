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
    """<span class="stReserved">import</span> org.scalatest._
      |<span class="stReserved">import</span> prop._
      |<span class="stReserved">import</span> scala.collection.immutable._
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
    """<span class="stReserved">import</span> org.scalatest._
      |<span class="stReserved">import</span> play.api.test._
      |<span class="stReserved">import</span> play.api.test.<span class="stType">Helpers</span>._
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
    """<span class="stReserved">import</span> org.scalatest._
      |@DoNotDiscover
      |<span class="stReserved">class</span> <span class="stType">SetSpec</span> <span class="stReserved">extends</span> <span class="stType">PropSpec</span> <span class="stReserved">with</span> <span class="stType">TableDrivenPropertyChecks</span> <span class="stReserved">with</span> <span class="stType">Matchers</span> { ... }
    """.stripMargin

  val ignoreTest: String =
    "ignore(<span class=\"stLiteral\">\"an empty Set should have size 0\"</span>) { ... }"

  val pendingTest: String =
    "property(<span class=\"stLiteral\">\"an empty Set should have size 0\"</span>) (pending)"

  val taggingTest: String =
    """<span class="stReserved">object</span> <span class="stType">SlowTest</span> <span class="stReserved">extends</span> <span class="stType">Tag</span>(<span class="stLiteral">"com.mycompany.tags.SlowTest"</span>)
      |property(<span class="stLiteral">"an empty Set should have size 0"</span>, <span class="stType">SlowTest</span>) { ... }
      |""".stripMargin
}