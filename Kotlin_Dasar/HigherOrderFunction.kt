// Higher order function adalah function yang menggunakan function sebagai parameternya-
// atau mengembalikan function.
// penggunan Higher order function kadang berguna ketika kita ingin membuaat function yang general dan-
// ingin mendapatkan input yang flexibel berupa lambda yang bisa dideklarasi oleh si user ketika memanggil-
// function tersebut.

fun main() {
    fun hello(name: String, transformer: (String) -> String): String{
        val nameTransform = transformer(name)
        return "hello $nameTransform"
    }
    val lambdaKeUpp = {nilaii: String -> nilaii.toUpperCase()}
    println(hello("Tono", lambdaKeUpp))

    println(hello("Tono", {nilai: String -> nilai.toLowerCase()}))

    // trailing lambda

    val hasil = hello("SUep", {nilai: String -> nilai.toLowerCase()})  // ini bukan trailing lambda

    val hasill = hello("SUep"){nilai: String ->       // ini yang trailing lambda, lebih enak dipandang
        nilai.toLowerCase()
    }
}