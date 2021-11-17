// INGAT, KABATAKU adalah KALI dulu, baru BAGI, lalu TAMBAH dan terakhir KURANG.
// Dan kalau ada perkalian berderet dengan pembagian, maka harus dihitung dari kiri dulu.
// Begitu juga kalau penjumlahan berderet dengan pengurangan, maka pengerjaannya
// dilakukan dari bilangan yang kiri dulu baru ke kanan

fun main() {
    val soal = 10/5
    println(soal)
    val soal1 = 10.0/3.0
    println(soal1)
    val soal2 = 10 + 10 / 2
    println(soal2)

    // augmented assignment
    var total: Int = 0
    val barang1 = 100
    total += barang1  //  +=, -=, /=, *=, %=

    val barang2 = 200
    total += barang2

    val barang3 = 300
    total += barang3

    println(total)
    // Unary operator

    total++ // total = total + 1, jadi artinya ++ itu ditambah 1
    println(total)

    total-- // total = total - 1, jadi artinya == itu dikurang 1
    println(total)

    val suhu = -5 // artinya negatif 5
    println(suhu)

    val sehat = true
    println(!sehat)  // ! artinya kebalikan
}