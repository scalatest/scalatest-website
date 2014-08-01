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

object ReleaseNotes extends Controller {

  def releaseNotesIndex = Action {
    Ok(views.html.releaseNotes.releaseNotesIndex())
  }

  def v221 = Action {
    Ok(views.html.releaseNotes.v221())
  }

  def v220 = Action {
    Ok(views.html.releaseNotes.v220())
  }

  def v217 = Action {
    Ok(views.html.releaseNotes.v217())
  }

  def v216 = Action {
    Ok(views.html.releaseNotes.v216())
  }

  def v215 = Action {
    Ok(views.html.releaseNotes.v215())
  }

  def v214 = Action {
    Ok(views.html.releaseNotes.v214())
  }

  def v213 = Action {
    Ok(views.html.releaseNotes.v213())
  }

  def v212 = Action {
    Ok(views.html.releaseNotes.v212())
  }

  def v211 = Action {
    Ok(views.html.releaseNotes.v211())
  }

  def v210 = Action {
    Ok(views.html.releaseNotes.v210())
  }

  def v20 = Action {
    Ok(views.html.releaseNotes.v20())
  }

  def v20History = Action {
    Ok(views.html.releaseNotes.v20History())
  }

  def v18 = Action {
    Ok(views.html.releaseNotes.v18())
  }

  def v191 = Action {
    Ok(views.html.releaseNotes.v191())
  }

  def v192 = Action {
    Ok(views.html.releaseNotes.v192())
  }

  def v17 = Action {
    Ok(views.html.releaseNotes.v17())
  }

  def v15_16 = Action {
    Ok(views.html.releaseNotes.v15_16())
  }

  def v13_14 = Action {
    Ok(views.html.releaseNotes.v13_14())
  }

  def v11_12 = Action {
    Ok(views.html.releaseNotes.v11_12())
  }

  def v10 = Action {
    Ok(views.html.releaseNotes.v10())
  }

  def v091_094 = Action {
    Ok(views.html.releaseNotes.v091_094())
  }
}
