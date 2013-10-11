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
    """import org.scalatest.FunSuite
      |<span class="stReserved">class</span> SetSuite <span class="stReserved">extends</span> FunSuite {
      |  test("An empty Set should have size 0") { assert(Set.empty.size === 0) }
      |  test("Invoking head on an empty Set should produce NoSuchElementException") {
      |    intercept[NoSuchElementException] { Set.empty.head }
      |  }
      |} """.stripMargin

  val doNotDiscover: String =
    """<span class="stReserved">import</span> org.scalatest._
      |@DoNotDiscover
      |<span class="stReserved">class</span> SetSuite <span class="stReserved">extends</span> FunSuite { ... }
    """.stripMargin

  val ignoreTest: String =
    "ignore(\"An empty Set should have size 0\") { ... }"

  val pendingTest: String =
    "test(\"An empty Set should have size 0\") (pending)"

  val taggingTest: String =
    """object SlowTest extends Tag("com.mycompany.tags.SlowTest")
      |test("An empty Set should have size 0", SlowTest) { ... }
      |""".stripMargin
}