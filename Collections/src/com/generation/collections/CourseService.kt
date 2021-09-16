package com.generation.collections

class CourseService {
    private var students: MutableMap<String, Student> = mutableMapOf<String, Student>()
    private var courses: MutableMap<String, Course> = mutableMapOf<String, Course>()
    fun enrollStudent(studentId: String?, courseId: String?) {
        //TODO implement so it adds the given course form the student
    }

    fun unEnrollStudent(studentId: String?, courseId: String?) {
        //TODO implement so it removes the given course form the student
    }

    fun displayCourseInformation(courseId: String?) {
        //TODO implement so it shows the course name, id and credits
    }

    fun displayStudentInformation(studentId: String?) {
        //TODO implement so it shows the student name, id and list of enrolled courses
    }

    init {
        students["120120"] = Student("Santiago", "120120")
        students["884545"] = Student("Kate", "884545")
        students["458787"] = Student("Alejandra", "458787")
        students["135464"] = Student("Maria", "135464")
        students["778979"] = Student("Peter", "778979")
        courses["math_01"] = Course("Mathematics 1", "math_01", 8)
        courses["biol_01"] = Course("Biology 1", "biol_01", 8)
        courses["phys_01"] = Course("Physics 1", "phys_01", 8)
        courses["art_01"] = Course("Arts 1", "art_01", 8)
        courses["chem_01"] = Course("Chemistry 1", "chem_01", 8)
        courses["sport_01"] = Course("Sports 1", "sport_01", 8)
    }
}