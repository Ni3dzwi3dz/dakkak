package blog.niedzwiedz.dakkak

import zio._
import zio.http._

import blog.niedzwiedz.dakkak.http.Router

object Main extends ZIOAppDefault:
  private val config = Server.Config.default.port(8080)
  val configLayer: ZLayer[Any, Nothing, Server.Config] = ZLayer.succeed(config)
  
  override val run =
    Server.serve(Router.routes).provide(
      configLayer,
      Server.live,
    )