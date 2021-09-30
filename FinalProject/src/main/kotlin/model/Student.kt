package model

import java.util.*

class Student(id: String?, name: String?, email: String?, birthDate: Date?) : Person(id, name, email, birthDate),
    Evaluation {
    private val average = 0.0

    private val courses: List<Course> = ArrayList()
    private val approvedCourses: MutableMap<String?, Course?> = HashMap()

    override fun getAverage(): Double {
        return average;
    }

    fun enrollToCourse(course: Course?) {
        //TODO implement this method
    }

    fun registerApprovedCourse(course: Course) {
        approvedCourses[course.code] = course
    }

    fun isCourseApproved(courseCode: String?): Boolean {
        //TODO implement this method
        return false
    }

    // CHALLENGE IMPLEMENTATION: Read README.md to find instructions on how to solve.
    fun findPassedCourses(course: Course?): List<Course>? {
        //TODO implement this method
        return null
    }

    fun isAttendingCourse(courseCode: String?): Boolean {
        //TODO implement this method
        return false
    }

    override fun getApprovedCourses(): List<Course>? {
        //TODO implement this method
        return ArrayList()
    }

    override fun toString(): String {
        return "Student {" + super.toString() + "}"
    }
}