package com.generation.collections

import kotlin.jvm.JvmStatic

object Main {
    @JvmStatic
    fun main(args: Array<String?>?) {
        val courseService = CourseService()
        val courseId = "math_01"
        val studentId = "120120"
        courseService.displayCourseInformation(courseId)
        courseService.displayStudentInformation(studentId)
        courseService.enrollStudent(studentId, courseId)
        courseService.displayStudentInformation(studentId)
        courseService.unEnrollStudent(studentId, courseId)
        courseService.displayStudentInformation(studentId)
    }
}