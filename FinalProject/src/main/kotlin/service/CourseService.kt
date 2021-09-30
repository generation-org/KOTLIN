package service

import model.Course
import model.Module
import java.util.HashMap
import model.Student
import java.util.ArrayList

class CourseService {
    private val courses: MutableMap<String, Course> = HashMap()
    private val enrolledStudents: MutableMap<String, MutableList<Student>> = HashMap()
    fun registerCourse(course: Course) {
        courses[course.code] = course
    }

    fun getCourse(code: String): Course? {
        return if (courses.containsKey(code)) {
            courses[code]
        } else null
    }

    fun enrollStudent(courseId: String, student: Student) {
        if (!enrolledStudents.containsKey(courseId)) {
            enrolledStudents[courseId] = ArrayList()
        }
        enrolledStudents[courseId]!!.add(student)
    }

    fun showEnrolledStudents(courseId: String) {
        if (enrolledStudents.containsKey(courseId)) {
            val students: List<Student> = enrolledStudents[courseId]!!
            for (student in students) {
                println(student)
            }
        }
    }

    fun showSummary() {
        println("Available Courses:")
        for (key in courses.keys) {
            val course = courses[key]
            println(course)
        }
        println("Enrolled Students")
        for (key in enrolledStudents.keys) {
            val students: List<Student> = enrolledStudents[key]!!
            println("Students on Course $key: ")
            for (student in students) {
                println(student)
            }
        }
    }

    init {
        val module = Module(
            "INTRO-CS", "Introduction to Computer Science",
            "Introductory module for the generation technical programs"
        )
        registerCourse(Course("INTRO-CS-1", "Introduction to Computer Science", 9, module))
        registerCourse(Course("INTRO-CS-2", "Introduction to Algorithms", 9, module))
        registerCourse(Course("INTRO-CS-3", "Algorithm Design and Problem Solving - Introduction ", 9, module))
        registerCourse(Course("INTRO-CS-4", "Algorithm Design and Problem Solving - Advanced", 9, module))
        registerCourse(Course("INTRO-CS-5", "Terminal Fundamentals", 9, module))
        registerCourse(Course("INTRO-CS-6", "Source Control Using Git and Github", 9, module))
        registerCourse(Course("INTRO-CS-7", "Agile Software Development with SCRUM", 9, module))
        val moduleWebFundamentals = Module(
            "INTRO-WEB", "Web Development Fundamentals",
            "Introduction to fundamentals of web development"
        )
        registerCourse(Course("INTRO-WEB-1", "Introduction to Web Applications", 9, moduleWebFundamentals))
        registerCourse(Course("INTRO-WEB-2", "Introduction to HTML", 9, moduleWebFundamentals))
        registerCourse(Course("INTRO-WEB-3", "Introduction to CSS", 9, moduleWebFundamentals))
        registerCourse(Course("INTRO-WEB-4", "Advanced HTML", 9, moduleWebFundamentals))
        registerCourse(Course("INTRO-WEB-5", "Advanced CSS", 9, moduleWebFundamentals))
        registerCourse(Course("INTRO-WEB-6", "Introduction to Bootstrap Framework", 9, moduleWebFundamentals))
        registerCourse(
            Course("INTRO-WEB-7", "Introduction to JavaScript for Web Development", 9, moduleWebFundamentals)
        )
    }
}