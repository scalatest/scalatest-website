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
      |<span class="stReserved">class</span> SetSpec <span class="stReserved">extends</span> PropSpec <span class="stReserved">with</span> TableDrivenPropertyChecks <span class="stReserved">with</span> Matchers {
      |  <span class="stReserved">val</span> examples =
      |    Table("set",
      |          BitSet.empty,
      |          HashSet.empty[Int],
      |          TreeSet.empty[Int])
      |  property("an empty Set should have size 0") {
      |    forAll(examples) { set => set.size should be (0) }
      |  }
      |  property("invoke head on an empty set should produce NoSuchElementException") {
      |    forAll(examples) {
      |      set => evaluating { set.head } should produce [NoSuchElementException]
      |    }
      |  }
      |} """.stripMargin

  val play2Example: String =
    """<span class="stReserved">import</span> org.scalatest._
      |<span class="stReserved">import</span> play.api.test._
      |<span class="stReserved">import</span> play.api.test.Helpers._
      |
      |<span class="stReserved">class</span> ExampleSpec <span class="stReserved">extends</span> PropSpec <span class="stReserved">with</span> Matchers {
      |  property("Application should send 404 on a bad request") {
      |    running(FakeApplication()) {
      |      route(FakeRequest(GET, "/boum")) shouldBe None
      |    }
      |  }
      |  property("Application should render the index page") {
      |    running(FakeApplication()) {
      |      <span class="stReserved">val</span> home = route(FakeRequest(GET, "/")).get
      |      status(home) shouldBe OK
      |      contentType(home) shouldBe Some("text/html")
      |      contentAsString(home) should include ("ScalaTest")
      |    }
      |  }
      |}""".stripMargin

  val doNotDiscover: String =
    """<span class="stReserved">import</span> org.scalatest._
      |@DoNotDiscover
      |<span class="stReserved">class</span> SetSpec <span class="stReserved">extends</span> PropSpec <span class="stReserved">with</span> TableDrivenPropertyChecks <span class="stReserved">with</span> Matchers { ... }
    """.stripMargin

  val ignoreTest: String =
    "ignore(\"an empty Set should have size 0\") { ... }"

  val pendingTest: String =
    "property(\"an empty Set should have size 0\") (pending)"

  val taggingTest: String =
    """object SlowTest extends Tag("com.mycompany.tags.SlowTest")
      |property("an empty Set should have size 0", SlowTest) { ... }
      |""".stripMargin
}