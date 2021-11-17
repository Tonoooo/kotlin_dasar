// operasi perbandingan adalah operasi untuk membandingkan dua buah data
// operator      |    keterangan
//   >           | lebih dari
//   <           | kurang dari
//   >=          | lebih dari sama dengan
//   <=          | kurang dari sama dengan
//   ==          | sama dengan
//   !=          | tidak sama dengan

fun main() {
    val satu = 100
    val dua = 200
    val soal: Boolean = satu > dua
    println(soal)

    println(100 <= 100)
    println(500 >= 300)

    println("a" < "b")
    println("a" > "b")
    println("a" != "b")
    println("a" == "b")

}