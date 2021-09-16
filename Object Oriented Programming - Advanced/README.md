<img align="right" width="150" height="150" src="https://media-exp1.licdn.com/dms/image/C4E0BAQF7BYCCZt5epw/company-logo_200_200/0?e=2159024400&v=beta&t=qUAFP9bUgBEEXGVQYpUXW1J_OiP8e0r4rFBpqp8OrxA">

# Kotlin - Object Oriented Programming - Advanced

 <br/>

## Part 1: Packages, Access Modifiers and Encapsulation


1. Download the source code, import the project into IntelliJ Idea and run it to verify it works correctly.
2. Go through the entire project and read the different classes and components trying to understand the logic behind.
3. Create at least two packages to organize your project better. Move the corresponding classes to the packages.
4. Modify the Student class so it follows the encapsulation principle keeping data private to the class.
5. Modify the Course class so it follows the encapsulation principle keeping data private to the class.
6. Modify the StudentService class so it follows the encapsulation principle:
* Make data private so it can only be modified inside the class.
* Create a method that lets you add students and use that in the main function.

## Part 2: Using collections with objects
1. Implment the following functions in the StudentService class:
```kotlin=
fun showEnrolledStudents(courseId: String?) {
    //TODO implement using collections loops
}

fun showAllCourses() {
    //TODO implement using collections loops
}

```

## Part 3: Using Kotlin Exeptions

1. Modify the enrollStudents method to verify:
* if the Course does not exists throw a *CourseNotFoundException*.
* if the Student does not exists throw a *StudentNotFoundException*.


```kotlin=
fun enrollStudents(courseName: String?, studentID: String?) {
    val course: Course = courseList.get(courseName)
    if (!coursesEnrolledByStudents.containsKey(studentID)) {
        coursesEnrolledByStudents.put(studentID, ArrayList<E>())
    }
    coursesEnrolledByStudents.get(studentID).add(course)
}
```

## Challenge yourself

1. Modify the *unEnrollStudents* method to verify:
* if the Course does not exists throw a *CourseNotFoundException*.
* if the Student does not exists throw a *StudentNotFoundException*.

```kotlin=
fun enrollStudents(courseName: String?, studentID: String?) {
    val course: Course = courseList.get(courseName)
    if (!coursesEnrolledByStudents.containsKey(studentID)) {
        coursesEnrolledByStudents.put(studentID, ArrayList<E>())
    }
    coursesEnrolledByStudents.get(studentID).add(course)
}
```