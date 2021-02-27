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
package controllers

import play.api._
import play.api.mvc._

class Plus extends Controller {

  def plusIndex = Action {
    Ok(views.html.plus.plusIndex())
  }

  def playFramework = Action {
    Ok(views.html.plus.playFramework())
  }

  def playVersions = Action {
    Ok(views.html.plus.playVersions())
  }

  def selenium = Action {
    Ok(views.html.plus.selenium())
  }

  def seleniumVersions = Action {
    Ok(views.html.plus.seleniumVersions())
  }

  def easymock = Action {
    Ok(views.html.plus.easymock())
  }

  def jmock = Action {
    Ok(views.html.plus.jmock())
  }

  def junit = Action {
    Ok(views.html.plus.junit())
  }

  def mockito = Action {
    Ok(views.html.plus.mockito())
  }

  def scalacheck = Action {
    Ok(views.html.plus.scalacheck())
  }

  def scalacheckVersions = Action {
    Ok(views.html.plus.scalacheckVersions())
  }

  def testng = Action {
    Ok(views.html.plus.testng())
  }
}
