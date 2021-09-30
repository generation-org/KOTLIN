package utils

import kotlin.Throws
import model.Student
import java.text.DateFormat
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

object PrinterHelper {
    @JvmStatic
    fun showMainMenu() {
        println("|-------------------------------|")
        println("| Welcome to StudentGen         |")
        println("|-------------------------------|")
        println("| Select 1 option:              |")
        println("| . 1 Register Student          |")
        println("| . 2 Find Student              |")
        println("| . 3 Grade Student             |")
        println("| . 4 Enroll Student to Course  |")
        println("| . 5 Show Students Summary     |")
        println("| . 6 Show Courses Summary      |")
        println("| . 7 Exit                      |")
        println("|-------------------------------|")
    }

    @JvmStatic
    @Throws(ParseException::class)
    fun createStudentMenu(scanner: Scanner): Student {
        println("|-------------------------------------|")
        println("| . 1 Register Student                |")
        println("|-------------------------------------|")
        println("| Enter student name:                 |")
        val name = scanner.next()
        println("| Enter student ID:                   |")
        val id = scanner.next()
        println("| Enter student email:                |")
        val email = scanner.next()
        println("| Enter student birth date(mm/dd/yyyy)|")
        val formatter: DateFormat = SimpleDateFormat("mm/dd/yyyy")
        //TODO validate date format and catch exception to avoid crash
        val birthDate = formatter.parse(scanner.next())
        println("|-------------------------------------|")
        val student = Student(id, name, email, birthDate)
        println("Student Successfully Registered! ")
        println(student)
        return student
    }
}