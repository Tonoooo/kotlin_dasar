// Extension Function adalah kemampuan menambahkan function pada tipe data yang sudah ada
// untuk membuat Extension Function, kita cukup menambah tipe data pada functionnya,
// lalu diikuti dengan tanda titik(.)
// untuk mengakses datanya diExtension Function, kita bisa gunakan kata kunci this

fun String.halo(): String = "halo $this"

fun String.cetakhai(): Unit = println("hai $this")

fun main() {
    val nama = "tono"

    println(nama.halo())

    nama.cetakhai()

    "tono".cetakhai()
}