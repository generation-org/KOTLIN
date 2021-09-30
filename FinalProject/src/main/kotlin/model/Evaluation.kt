package model

interface Evaluation {
    fun getAverage() : Double
    fun getApprovedCourses(): List<Course>?
}