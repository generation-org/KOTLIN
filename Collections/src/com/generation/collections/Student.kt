package com.generation.collections


class Student(var name: String, var id: String) {
    private var enrolledCourses: MutableList<Course> = mutableListOf<Course>()
    fun enroll(course: Course) {
        enrolledCourses.add(course)
    }

    fun unEnroll(course: Course?) {
        enrolledCourses.remove(course)
    }

    fun totalEnrolledCourses(): Int {
        //TODO implement
        return 0
    }

    @Override
    override fun toString(): String {
        return ("Student{" + "name='" + name + '\'' + ", id='" + id + '\'' + ", enrolledCourses=" + enrolledCourses
                + '}')
    }
}