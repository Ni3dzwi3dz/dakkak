package blog.niedzwiedz.dakkak.http

import zio.*
import zio.http.*

object Router:
  val routes =
    (HealthEndpoints.routes)
    .toHttpApp