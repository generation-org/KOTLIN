package model

import java.util.*

class Instructor protected constructor(id: String?, name: String?, email: String?, birthDate: Date?) :
    Person(id, name, email, birthDate) {
    var experienceMonths = 0
    private val teachingCourses: List<Course> = ArrayList()
}