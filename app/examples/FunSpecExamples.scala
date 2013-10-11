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

object FunSpecExamples extends StyleTraitExamples {

  val name: String = "FunSpec"

  val exampleUsage: String =
    """<span class="stReserved">import</span> org.scalatest.FunSpec
      |<span class="stReserved">class</span> SetSpec <span class="stReserved">extends</span> FunSpec {
      |  describe("A Set") {
      |    describe("when empty") {
      |      it("should have size 0") { assert(Set.empty.size === 0) }
      |      it("should produce NoSuchElementException when head is invoked") {
      |        intercept[NoSuchElementException] { Set.empty.head }
      |      }
      |    }
      |  }
      |} """.stripMargin

  val doNotDiscover: String =
    """<span class="stReserved">import</span> org.scalatest._
      |@DoNotDiscover
      |<span class="stReserved">class</span> SetSpec <span class="stReserved">extends</span> FunSpec { ... }
    """.stripMargin

  val ignoreTest: String =
    "ignore(\"should have size 0\") { ... }"

  val pendingTest: String =
    "it(\"should have size 0\") (pending)"

  val taggingTest: String =
    """object SlowTest extends Tag("com.mycompany.tags.SlowTest")
      |it("should have size 0", SlowTest) { ... }
      |""".stripMargin
}