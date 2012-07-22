package controllers

import play.api._
import play.api.mvc._

object ReleaseNotes extends Controller {

  def releaseNotesIndex = Action {
    Ok(views.html.releaseNotes.releaseNotesIndex())
  }

  def v20m2 = Action {
    Ok(views.html.releaseNotes.v20m2())
  }

  def v18 = Action {
    Ok(views.html.releaseNotes.v18())
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
