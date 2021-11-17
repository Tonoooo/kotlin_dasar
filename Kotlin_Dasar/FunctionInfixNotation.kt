// Infix Notation operasi yang biasa dilakukan dioperasi matemtika, dimana dia melakukan-
// operasi terhadap dua data
// hampir semua operasi matematika adalah Infix Notation
// untuk menggunakan function Infix Notation, tidak wajib mengggunakan titik (.)
// syaratnya :
// harus sebagai function extension, harus memiliki 1 parameter(tidak kurang tdk lebih)
// dan parameter tidak boleh vararg dan tidak boleh memiliki nilai default

infix fun String.ke(tipe: String): String{
    if (tipe == "UP"){
        return this.toUpperCase() // toUpperCase adalah function distring untuk menjadikan karakter nya menjadi uppercase(hurup besar semua)
    }else{
        return this.toLowerCase() // toLowerCase adalah function distring untuk menjadikan karakter nya menjadi lowercase(hurup kecil semua)
    }
}

fun main() {
    val namanya = "Tono Suep" ke "UP"
    println(namanya)

    val nama = "Riaaaan" ke "LO"
    println(nama)
}