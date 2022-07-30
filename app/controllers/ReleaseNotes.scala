/**
 * Copyright 2010-2015 Artima, Inc.
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
import javax.inject.Inject

class ReleaseNotes @Inject() (cc: ControllerComponents) extends AbstractController(cc) {

  def releaseNotesIndex = Action {
    Ok(views.html.releaseNotes.releaseNotesIndex())
  }
  def v3213 = Action {
    Ok(views.html.releaseNotes.v3213())
  }
  def v3212 = Action {
    Ok(views.html.releaseNotes.v3212())
  }

  def v3211 = Action {
    Ok(views.html.releaseNotes.v3211())
  }

  def v3210 = Action {
    Ok(views.html.releaseNotes.v3210())
  }

  def v329 = Action {
    Ok(views.html.releaseNotes.v329())
  }

  def v328 = Action {
    Ok(views.html.releaseNotes.v328())
  }

  def v327 = Action {
    Ok(views.html.releaseNotes.v327())
  }

  def v326 = Action {
    Ok(views.html.releaseNotes.v326())
  }

  def v325 = Action {
    Ok(views.html.releaseNotes.v325())
  }

  def v324 = Action {
    Ok(views.html.releaseNotes.v324())
  }

  def v323 = Action {
    Ok(views.html.releaseNotes.v323())
  }

  def v322 = Action {
    Ok(views.html.releaseNotes.v322())
  }

  def v321 = Action {
    Ok(views.html.releaseNotes.v321())
  }

  def v320 = Action {
    Ok(views.html.releaseNotes.v320())
  }

  def v314 = Action {
    Ok(views.html.releaseNotes.v314())
  }

  def v313 = Action {
    Ok(views.html.releaseNotes.v313())
  }

  def v312 = Action {
    Ok(views.html.releaseNotes.v312())
  }

  def v311 = Action {
    Ok(views.html.releaseNotes.v311())
  }

  def v310 = Action {
    Ok(views.html.releaseNotes.v310())
  }

  def v309 = Action {
    Ok(views.html.releaseNotes.v309())
  }

  def v308 = Action {
    Ok(views.html.releaseNotes.v308())
  }

  def v307 = Action {
    Ok(views.html.releaseNotes.v307())
  }

  def v306 = Action {
    Ok(views.html.releaseNotes.v306())
  }

  def v305 = Action {
    Ok(views.html.releaseNotes.v305())
  }

  def v304 = Action {
    Ok(views.html.releaseNotes.v304())
  }

  def v303 = Action {
    Ok(views.html.releaseNotes.v303())
  }

  def v302 = Action {
    Ok(views.html.releaseNotes.v302())
  }

  def v301 = Action {
    Ok(views.html.releaseNotes.v301())
  }

  def v300 = Action {
    Ok(views.html.releaseNotes.v300())
  }

  def v226 = Action {
    Ok(views.html.releaseNotes.v226())
  }

  def v225 = Action {
    Ok(views.html.releaseNotes.v225())
  }

  def v224 = Action {
    Ok(views.html.releaseNotes.v224())
  }

  def v222 = Action {
    Ok(views.html.releaseNotes.v222())
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
