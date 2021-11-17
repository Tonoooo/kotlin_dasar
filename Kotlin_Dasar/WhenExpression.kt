// When merupakan salah satu kontrol percabangan di dalam Kotlin. When akan menjalankan-
// kode yang berbeda berdasarkan nilai dari argument variabel. When tidak membutuhkan-
// break statement karena when hanya akan memakai cabang pertama yang cocok dan setelah-
// itu akan keluar dari when

fun main() {

    val nilai = "B"

    when (nilai) {
        "A" -> {
            println("sempurna")
        }
        "B" -> {
            println("bagus")
        }
        "C" -> {
            println("lumayan")
        }
        "D" -> {
            println("jelek")
        }
        else -> {
            println("jangan menyerah")
        }
    }

    // atau yang lebih simple
    when (nilai){
        "A" -> println("oke banget")
        "B" -> println("okeee ")
        "C" -> println("okee")
        "D" -> println("oke")
        else -> println("payah")
    }

    // when expression multiple option
    when(nilai){
        "A", "B", "C" ->{
            println("Selamat anda lulus")
        }
        else -> {
            println("Maaf anda tidak lulus")
        }
    }

    // when expression in
    val nilailulus: Array<String> = arrayOf("A", "B", "C")
    when(nilai){
        in nilailulus -> println("Anda lulus")
        !in nilailulus -> println("Anda tidak lulus")
    }

    // when expression is adalah mengecek data
    val nama = "Tono"
    when (nama){
        is String -> println("ini string")
        !is String -> println("bukan string")
    }

    // when sebagai pengganti if else
    val skor = 99
    when{
        skor > 90 -> println("sempurna")
        skor > 80 -> println("bagus")
        skor > 70 -> println("jelek")
        else -> println("bodoh")
    }
}