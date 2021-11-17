/**
 * lambda akan menganggap baris terakhir di blok lambda sebagai hasil pengembalian
 * kadang kita butuh membuat lambda yang se flexible function, dimana kita bisa mengembalikan hasil dimanapun
 * Anonymous Function sebenarnya mirip dengan lambda, hanya cara membuatnya saja yang sedikit beda, masih menggunakan kata kunci fun
 */

fun main() {
    fun hello(name: String, transformer: (String) -> String): String{
        val nameTransform = transformer(name)
        return "hello $nameTransform"
    }

    val gede = fun(nilai: String): String{
        if (nilai == ""){
            return "kosong"
        }else{
            return nilai.toUpperCase()
        }
    }
    println(hello("tono", gede))
    println(hello("", gede))

    // Anonymous Function as parameter
    println(hello("SUep", fun(nilai: String): String{
        return nilai.toLowerCase()
    }))
}