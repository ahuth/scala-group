package CaseClasses

case class Location(city: String, country: String)
case class Person(name: String, location: Location)

object CaseClasses {
  def extract_name(peep: Person): String = peep match {
    case Person(name, _) => name
  }

  def is_canadian(peep: Person): Boolean = peep match {
    case Person(_, Location(_, "Canada")) => true
    case _ => false
  }

  def names_from(people: List[Person], country: String): List[String] = people match {
    case Nil => List.empty[String]
    case Person(name, Location(_, `country`)) :: tail => name :: names_from(tail, country)
    case _ :: tail => names_from(tail, country)
  }
}
