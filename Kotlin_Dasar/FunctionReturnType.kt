
// ~ untuk memberitahu bahwa function mengembalikan data, kita harus menuliskan tipe data kembalian dari function tersebut
// ~ jika function tersebut kita deklarasikan dengan tipe data pengembalian, maka wajib didalam functionnya
//   kita harus mengembalikan data
// ~ untuk mengembalikan data dari function, kita bisa menggunakan kata kunci return, diikuti dengan datanya

fun penjumlahan(a: Int, b: Int): Int{   // :Int artinya hasilnya integer
    val total = a + b
    return total
}


fun pembagian(a: Int, b: Int): Int{
    if (b == 0){
        return 0
    }else{
        val alhasil = a/b
        return alhasil
    }
}


fun main() {
    println(penjumlahan(10, 10))
    println(penjumlahan(100, 100))

    val hasil = penjumlahan(50, 50)
    println(hasil)

    println(pembagian(100, 10))
    println(pembagian(100, 0))
}