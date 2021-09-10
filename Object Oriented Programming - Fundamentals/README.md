<img align="right" width="150" height="150" src="https://media-exp1.licdn.com/dms/image/C4E0BAQF7BYCCZt5epw/company-logo_200_200/0?e=2159024400&v=beta&t=qUAFP9bUgBEEXGVQYpUXW1J_OiP8e0r4rFBpqp8OrxA">

# Kotlin - 8  - Object Oriented Programming - Fundamentals

 <br/>

## Part 1: Exploring the School System Project

1. Create a new Kotlin project using IntelliJ Idea.
2. Create a Student class. This class must have the following attributes:

```kotlin=

   class Student {
    var firstName: String? = null
    var lastName: String? = null
    var registration = 0
    var grade = 0
    var year = 0
}

```

3. Now, make the Student class implement the following methods:

```kotlin=

    fun printFullName() {
        //TODO implement
    }

    //TODO implement: should return true if grade >= 60
    val isApproved: Unit
        get() {
            //TODO implement: should return true if grade >= 60
        }

    fun changeYearIfApproved(): Int {
        //TODO implement: the student should advance to the next year if he/she grade is >= 60
        // Make year = year + 1, and print "Congragulations" if the student has been approved
        return 0
    }

```

4. Add constructors to your Student class:

* Make the class with at least three different constructors.
5. Create a Java class for Courses

* Your Course class must have, as attributes: courseName, professorName, year.
* Your class must also contain a collection that lists all students enrolled in them.
* Implement the following methods.

```kotlin=

    fun enroll(student: Student?) {
        //TODO add the student to the collection
    }

    fun unEnroll(student: Student?) {
        //TODO remove this student from the collection
        // Hint: check if that really is this student
    }

    fun countStudents(): Int {
        //TODO implement
        return 0
    }

    fun bestGrade(): Int {
        //TODO implement
        return 0
    }

```

6. Run the main method and verify that your implementation works.

7. Method Overload:

* Overload the enroll method to take in an array of students.

```kotlin=

    fun enroll(students: Array<Student?>?) {
        //TODO add all the students to the collection
    }

```

* Add on to the main method and call enroll with a list of students. Verify that your implementation works.

## Challenge yourself

* Implement a function that calculates the average grade for that course.
* Implement a function that outputs a ranking with all students enrolled in a course and respective grades.
* Implement a function that, for each student, show if he/she is above course average or not.