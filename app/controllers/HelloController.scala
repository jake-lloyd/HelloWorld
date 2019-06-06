package controllers

import javax.inject._
import play.api.mvc._

@Singleton
class HelloController @Inject()(cc: ControllerComponents) extends AbstractController(cc){
  def helloworld: Action[AnyContent] = Action {
    Ok("Hello, world")
  }
}
