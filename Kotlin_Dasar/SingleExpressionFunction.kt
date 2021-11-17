// Single Expression Function adalah dekralasi function hanya dengan 1 baris kode
// untuk membuat Single Expression Function, kita hanya butuh tanda = (samadengan)setelah dekralasi-
// nama function dan tipe data pengembalian function

fun dikalidua(a: Int): Int = a * 2   // = a * 2 disebut expression dan akan langsung dijadikan return value

fun sapa(nama: String): Unit = println("hai $nama")

fun main() {
    println(dikalidua(10))
    sapa("tono")
}