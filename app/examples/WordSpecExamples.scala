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
    """<span class="stReserved">import</span> org.scalatest.WordSpec
      |<span class="stReserved">class</span> SetSpec <span class="stReserved">extends</span> WordSpec {
      |  "A Set" when {
      |    "empty" should {
      |      "have size 0" in {
      |        assert(Set.empty.size === 0)
      |      }
      |      "produce NoSuchElementException when head is invoked" in {
      |        intercept[NoSuchElementException] {
      |          Set.empty.head
      |        }
      |      }
      |    }
      |  }
      |}""".stripMargin

  val doNotDiscover: String =
    """<span class="stReserved">import</span> org.scalatest._
      |@DoNotDiscover
      |<span class="stReserved">class</span> SetSpec <span class="stReserved">extends</span> WordSpec { ... }
    """.stripMargin

  val ignoreTest: String =
    "\"have size 0\" ignore { ... }"

  val pendingTest: String =
    "\"have size 0\" in (pending)"

  val taggingTest: String =
    """object SlowTest extends Tag("com.mycompany.tags.SlowTest")
      |"have size 0" taggedAs(SlowTest) in { ... }
      |""".stripMargin
}