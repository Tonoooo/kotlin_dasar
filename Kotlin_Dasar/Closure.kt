/**
 * clousere adalah kemampuan sebuah function, lambda atau anonymus function berinteraksi dengan-
 * data data sekitarnya
 * hati hati dalam menggunakan clouser gunakan dengan bijak
 */

fun main() {
    var untukclosure: Int = 0

    val inilambda:() -> Unit = {
        println("ini lambda ")
        untukclosure++    //ini contoh closure (berinteraksi dengan data sekitar)
    }

    val inianonymusfunction = fun (){
        println("ini anonymus function")
        untukclosure++    //ini contoh closure (berinteraksi dengan data sekitar)
    }

    fun inifunction(){
        println("ini function")
        untukclosure++    //ini contoh closure (berinteraksi dengan data sekitar)
    }

    inilambda()
    inianonymusfunction()
    inifunction()
    inilambda()
    inianonymusfunction()
    inifunction()

    println(untukclosure)
}