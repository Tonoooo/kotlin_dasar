// lambda expression secara sederhana adalah function yang tidak memiliki nama
// dengan lambda expression, kita bisa membuat function tanpa harus mendeskripsikan functionnya
// jika berbaris lambda akan menganggap baris terakhir di blok lambda sebagai hasil pengembalian (mungkin)

// penjelasan dan cara penggunaanya bisa-
// menonton video tutorial https://youtu.be/0p1gy-crNDU
// atau bisa menontonnya di penyimpanan komputer ini E:\belajar\code\kotlin\VideoTutorialKotlin

fun keUp(nilai: String): String = nilai.toUpperCase() // ini untuk method references
fun main() {
    // lambda expression
    val namalambda: (String, String) -> String = {namasatu: String, namadua: String ->
        val nilai = "$namasatu $namadua"
        nilai
    }
    val ininilai = namalambda("tono", "suep")
    println(ininilai)


    // it
    val sayhello: (String) -> String = {
        "hello $it" // it adalah parameter pertama, tapi dengan syarat harus memiliki satu parameter tidak lebih
    }
    println(sayhello("tono"))


    // method references
    // adalah membuat lambda expression dengan menggunakan function yang sudah ada.
    // cara menggunakannya      ::namafunction         ingat tanpa ()
    val besarsemua : (String) -> String = ::keUp
    println(besarsemua("tono suep"))
}