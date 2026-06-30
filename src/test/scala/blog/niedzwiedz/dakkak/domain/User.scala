import zio.test.*
import java.time.LocalDateTime

import blog.niedzwiedz.dakkak.domain.models._

object UserSpec extends ZIOSpecDefault:
  override def spec = suite("UserSpec")(
    test("create user") {

      val now = LocalDateTime.now()
      val user = User(
        id = "1",
        name = "John Doe",
        email = "john.doe@example.com",
        role = UserRole.Regular,
        createdAt = now,
        updatedAt = now,
      )
      assertTrue(user.id == "1")
      assertTrue(user.name == "John Doe")
      assertTrue(user.email == "john.doe@example.com")
      assertTrue(user.role == UserRole.Regular)
      assertTrue(user.createdAt == now)
      assertTrue(user.updatedAt == now)
    }
  )