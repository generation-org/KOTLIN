
import java.util.*
import kotlin.jvm.JvmStatic

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val console = Scanner(System.`in`)
        println("Enter your name:  ")
        val name = console.next()
        printNameCharacters(name)
        printNameLength(name)
        console.close()
    }

    private fun printNameLength(name: String) {
        //TODO implement this code
    }

    private fun printNameCharacters(name: String) {
        //TODO implement this code
    }
}