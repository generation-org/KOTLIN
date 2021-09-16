package com.generation
import java.util.HashMap
import com.generation.Course
import com.generation.Student
import java.util.ArrayList

class StudentService {
    var courseList = HashMap<String, Course>()
    var students = HashMap<String, Student>()
    var coursesEnrolledByStudents = HashMap<String, MutableList<Course?>>()
    fun enrollStudents(courseName: String, studentID: String) {
        val course = courseList[courseName]
        if (!coursesEnrolledByStudents.containsKey(studentID)) {
            coursesEnrolledByStudents[studentID] = ArrayList()
        }
        coursesEnrolledByStudents[studentID]!!.add(course)
    }

    fun unEnrollStudents(courseName: String, studentID: String) {
        val course = courseList[courseName]
        if (coursesEnrolledByStudents.containsKey(studentID)) {
            coursesEnrolledByStudents[studentID]!!.remove(course)
        }
    }

    fun showEnrolledStudents(courseId: String?) {
        //TODO implement using collections loops
    }

    fun showAllCourses() {
        //TODO implement using collections loops
    }

    init {
        courseList["Math"] = Course("Math", 10, "Aurelio Baldor")
        courseList["Physics"] = Course("Physics", 10, "Albert Einstein")
        courseList["Art"] = Course("Art", 10, "Pablo Picasso")
        courseList["History"] = Course("History", 10, "Sima Qian")
        courseList["Biology"] = Course("Biology", 10, "Charles Darwin")
    }
}