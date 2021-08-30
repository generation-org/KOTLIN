package com.generation.kotlin

import kotlin.jvm.JvmStatic

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val generationPrinter = GenerationPrinter()
        generationPrinter.sayHello("Elise")
        generationPrinter.sayGoodBye("Elise")
    }
}