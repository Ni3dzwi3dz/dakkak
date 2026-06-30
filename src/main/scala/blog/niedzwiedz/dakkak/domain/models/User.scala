package blog.niedzwiedz.dakkak.domain.models

import java.time.LocalDateTime

sealed trait UserRole
object UserRole:
  case object Admin extends UserRole
  case object Regular extends UserRole



case class User(
  id: String,
  name: String,
  email: String,
  role: UserRole,
  createdAt: LocalDateTime,
  updatedAt: LocalDateTime,
)
