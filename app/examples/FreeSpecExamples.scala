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

object FreeSpecExamples extends StyleTraitExamples {

  val name: String = "FreeSpec"

  val exampleUsage: String =
    """<span class="stReserved">import</span> org.scalatest.FreeSpec
      |<span class="stReserved">class</span> SetSpec <span class="stReserved">extends</span> FreeSpec {
      |  "A Set" - {
      |    "when empty" - {
      |      "should have size 0" in { assert(Set.empty.size === 0) }
      |      "should produce NoSuchElementException when head is invoked" in {
      |        intercept[NoSuchElementException] { Set.empty.head }
      |      }
      |    }
      |  }
      |} """.stripMargin

  val play2Example: String =
    """<span class="stReserved">import</span> org.scalatest._
      |<span class="stReserved">import</span> play.api.test._
      |<span class="stReserved">import</span> play.api.test.Helpers._
      |
      |<span class="stReserved">class</span> ExampleSpec <span class="stReserved">extends</span> FreeSpec <span class="stReserved">with</span> Matchers {
      |  "Application should" - {
      |    "send 404 on a bad request" in running(FakeApplication()) {
      |      route(FakeRequest(GET, "/boum")) shouldBe None
      |    }
      |    "render the index page" in running(FakeApplication()) {
      |      val home = route(FakeRequest(GET, "/")).get
      |      status(home) shouldBe OK
      |      contentType(home) shouldBe Some("text/html")
      |      contentAsString(home) should include ("ScalaTest")
      |    }
      |  }
      |}""".stripMargin

  val doNotDiscover: String =
    """<span class="stReserved">import</span> org.scalatest._
      |@DoNotDiscover
      |<span class="stReserved">class</span> SetSpec <span class="stReserved">extends</span> FreeSpec { ... }
    """.stripMargin

  val ignoreTest: String =
    "\"should have size 0\" ignore { ... }"

  val pendingTest: String =
    "\"should have size 0\" in (pending)"

  val taggingTest: String =
    """object SlowTest extends Tag("com.mycompany.tags.SlowTest")
      |"should have size 0" taggedAs(SlowTest) in { ... }
      |""".stripMargin
}