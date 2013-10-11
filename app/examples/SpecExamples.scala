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
    """<span class="stReserved">import</span> org.scalatest.Spec
      |<span class="stReserved">class</span> SetSpec <span class="stReserved">extends</span> Spec {
      |  <span class="stReserved">object</span> `A Set` {
      |    <span class="stReserved">object</span> `when empty` {
      |      <span class="stReserved">def</span> `should have size 0` { assert(Set.empty.size === 0) }
      |      <span class="stReserved">def</span> `should produce NoSuchElementException when head is invoked` {
      |        intercept[NoSuchElementException] { Set.empty.head }
      |      }
      |    }
      |  }
      |} """.stripMargin

  val doNotDiscover: String =
    """<span class="stReserved">import</span> org.scalatest._
      |@DoNotDiscover
      |<span class="stReserved">class</span> SetSpec <span class="stReserved">extends</span> Spec { ... }
    """.stripMargin

  val ignoreTest: String =
    "@Ignore def `should have size 0` { ... }"

  val pendingTest: String =
    "def `should have size 0` { pending }"

  val taggingTest: String =
    """// SlowTest is a Java annotation
      |@SlowTest def `should have size 0` { ... }
      |""".stripMargin
}