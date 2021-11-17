// Function Scope adalah ruang lingkup dimana sebuah function bisa diakses
// jika kita ingin membatasi misalnya sebuah function hanya bisa diakses dalam function tertentu,
// maka kita bisa membuat function didalam function

fun main() {
    fun cohtohscope(){
        println("function ini hanya bisa diakses di dalam blok ini saja (fun main)")
    }
    cohtohscope()
}