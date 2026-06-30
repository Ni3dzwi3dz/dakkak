package blog.niedzwiedz.dakkak.domain.models

import java.time.LocalDateTime

sealed trait ToDoStatus
object ToDoStatus:
  case object Backlog extends ToDoStatus
  case object Ready extends ToDoStatus
  case object InProgress extends ToDoStatus
  case object Completed extends ToDoStatus
  case object Cancelled extends ToDoStatus
  case object Blocked extends ToDoStatus


sealed trait ToDoType
object ToDoType:
    case object Single extends ToDoType
    case object Recurring extends ToDoType
    case object LongRunning extends ToDoType

case class Todo(
  id: String,
  title: String,
  description: Option[String],
  status: ToDoStatus,
  todoType: ToDoType,
  createdAt: LocalDateTime,
  updatedAt: LocalDateTime,
  owner: User,
  assignees: Option[List[User]],
  labels: Option[List[String]],
  dueDate: Option[LocalDateTime],
  comments: Option[List[Comment]],
)

case class Comment(
  id: String,
  content: String,
  createdAt: LocalDateTime,
  updatedAt: LocalDateTime,
  owner: User,
)

case class ToDoLabel(
  id: String,
  name: String,
  color: String,
)