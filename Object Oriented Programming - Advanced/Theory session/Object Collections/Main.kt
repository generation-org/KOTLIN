import person.Person
import PersonService.PersonService

internal object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val personService = PersonService()
        personService.addPerson(Person("Elise", 33, "3434343"))
        personService.addPerson(Person("Santiago", 33, "1020212"))
        personService.addPerson(Person("Ian", 33, "42141"))
        val foundPerson = personService.findPersonByName("Santiago")
        println("Person: $foundPerson")
        personService.showPersonsById()
    }
}