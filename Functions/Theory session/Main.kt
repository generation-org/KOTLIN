import java.util.*
import kotlin.jvm.JvmStatic

internal object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val console = Scanner(System.`in`)
        print("Enter addition number 1  ")
        var num1 = console.nextInt()
        print("Enter addition number 2  ")
        var num2 = console.nextInt()
        val addition = num1 + num2
        println("$num1 + $num2 = $addition")
        print("Enter subtraction number 1  ")
        num1 = console.nextInt()
        print("Enter subtraction number 2  ")
        num2 = console.nextInt()
        val subtraction = num1 - num2
        println("$num1 - $num2 = $subtraction")
        print("Enter multiplication number 1  ")
        num1 = console.nextInt()
        print("Enter multiplication number 2  ")
        num2 = console.nextInt()
        val multiplication = num1 * num2
        println("$num1 * $num2 = $multiplication")
        print("Enter division number 1  ")
        num1 = console.nextInt()
        print("Enter division number 2  ")
        num2 = console.nextInt()
        val division = num1 / num2
        println("$num1 / $num2 = $division")
    }
}