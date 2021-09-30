package model

import java.util.HashMap

class Module(val code: String, val name: String, val description: String) {
    private val prerequisites: MutableMap<String, Module> = HashMap()
    fun addPrerequisite(module: Module) {
        prerequisites[module.code] = module
    }

    fun getPrerequisites(): Map<String, Module> {
        return prerequisites
    }

    override fun toString(): String {
        return "Module{name='$name'}"
    }
}