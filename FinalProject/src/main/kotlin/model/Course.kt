package model

class Course(val code: String, val name: String, val credits: Int, val module: Module) {
    override fun toString(): String {
        return ("Course{" + "code='" + code + '\'' + ", name='" + name + '\'' + ", credits=" + credits + ", module="
                + module + '}')
    }
}