package PersonService

import person.Person

import java.util.ArrayList
import java.util.HashMap

class PersonService {
    private val personList: MutableList<Person> = ArrayList()
    private val personsById = HashMap<String, Person>()
    fun findPersonByName(name: String): Person? {
        for (person in personList) {
            if (person.name == name) {
                return person
            }
        }
        return null
    }

    fun showPersonsById() {
        for (id in personsById.keys) {
            println(personsById[id])
        }
    }

    fun addPerson(person: Person) {
        personList.add(person)
        personsById[person.id] = person
    }

    fun findPersonById(id: String?): Person? {
        //TODO implement this method
        return null
    }
}