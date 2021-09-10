import kotlin.jvm.JvmStatic

class Shoe {
    var size: String? = null
    var color: String? = null

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val myShoe = Shoe()
            myShoe.size = "6.5"
            myShoe.color = "black"
            println(myShoe.size)
        }
    }
}