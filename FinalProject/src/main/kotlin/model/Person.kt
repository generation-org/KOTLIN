package model

import java.util.*

abstract class Person protected constructor(val id: String?, val name: String?, val email: String?, val birthDate: Date?) {
    override fun toString(): String {
        return "$id', name='$name', email='$email', birthDate=$birthDate"
    }
}