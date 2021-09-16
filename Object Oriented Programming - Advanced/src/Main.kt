import com.generation.*

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val studentService = StudentService()
        //TODO refactor this code to use encapsulation inside studentsService
        studentService.students["1030"] = Student("Carlos", "1030", 31)
        studentService.students["1040"] = Student("Ian", "1020", 28)
        studentService.students["1050"] = Student("Elise", "1020", 26)
        studentService.students["1020"] = Student("Santiago", "1020", 33)
        studentService.enrollStudents("Math", "1030")
    }
}