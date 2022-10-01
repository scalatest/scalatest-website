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
package test

import play.api.test._
import play.api.test.Helpers._
import org.scalatestplus.play.PlaySpec
import org.scalatestplus.play.guice.GuiceOneAppPerTest

class ExampleUnitSpec extends PlaySpec with GuiceOneAppPerTest {

  "Application" must {
    
    "send 404 on a bad request" in {
      status(route(app, FakeRequest(GET, "/boum")).get) mustBe NOT_FOUND
    }
    
    "render the index page" in running(app) {
      val home = route(app, FakeRequest(GET, "/")).get
        
      status(home) mustBe OK
      contentType(home).value mustBe "text/html"
      contentAsString(home) must include ("ScalaTest")
    }
  }
}

