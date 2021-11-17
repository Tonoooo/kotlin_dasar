fun main() {
    var kalimat: String = "string adalah kumpulan karakter atau disebut juga teks"
    var lebih: String = """
        
        untuk string yang satu baris menggunakan dua tanda petik
        tapi untuk yang lebih dari satu baris gunakan tiga tanda petik
        
    """
    var rapih: String = """
        |ini berfungsi untuk
        |menghapus apa yang ada disisi
        |sebelahnya
    """.trimMargin() // | ini untuk agar sejajar sisinya, dan ini bisa diubah bukan hanya | tapi kita bisa ganti
                     // dengan cara di dalam kurung contohnya (">")

    println(kalimat)
    println(lebih)
    println(rapih)

    // menggabungkan string
    var satu: String = "nama saya"
    var dua: String = "tono"

    var kumpul: String = satu + " " + dua // cara ini tidak terlalu direkomendasikan karna ribet
    println(kumpul)

    var kekumpul: String = "$satu $dua" // $ ini berfungsi untuk mengambil
    println(kekumpul)

    var deskripsi: String = "$kekumpul panjangnya = ${kekumpul.length}"
    println(deskripsi)

}