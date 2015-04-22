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

trait StyleTraitExamples {
  val name: String
  def description: String
  def exampleUsage: String
  def play2Example: String
  def doNotDiscover: String
  def ignoreTest: String
  def pendingTest: String
  def taggingTest: String
  def infoTest: String
  def fixtureNoArgTest: String
  def fixtureOneArgTest: String
  def seleniumExample: String
}

object StyleTraitExamples {

  val examples: Map[String, StyleTraitExamples] =
    Map(
      "FlatSpec" -> FlatSpecExamples,
      "FunSuite" -> FunSuiteExamples,
      "FunSpec" -> FunSpecExamples,
      "WordSpec" -> WordSpecExamples,
      "FreeSpec" -> FreeSpecExamples,
      "Spec" -> SpecExamples,
      "PropSpec" -> PropSpecExamples,
      "FeatureSpec" -> FeatureSpecExamples
    )
}
