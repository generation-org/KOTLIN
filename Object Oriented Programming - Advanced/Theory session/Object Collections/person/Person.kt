package person

class Person(val name: String, val age: Int, val id: String) {
    override fun toString(): String {
        return "Person{name='$name', age=$age, id='$id'}"
    }
}