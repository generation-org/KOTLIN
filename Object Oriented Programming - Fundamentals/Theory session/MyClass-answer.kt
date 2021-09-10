import kotlin.jvm.JvmStatic

class MyClass {
    var x = 5

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val myObj = `MyClass-answer`()
            println(myObj.x)
        }
    }
}