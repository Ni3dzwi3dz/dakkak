package blog.niedzwiedz.dakkak.http

import zio.*
import zio.http.*

object HealthEndpoints:
  val routes = Routes(
    Method.GET / "health" -> health
  )

  def health: Handler[Any, Nothing, Request, Response] =
    Handler.fromZIO(
        ZIO.succeed(
            Response.text("OK")
        )
    )