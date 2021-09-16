package com.generation.collections

class Course(var name: String, var id: String, var credits: Int) {
    @Override
    override fun toString(): String {
        return "Course{name='$name', id='$id', credits=$credits}"
    }
}