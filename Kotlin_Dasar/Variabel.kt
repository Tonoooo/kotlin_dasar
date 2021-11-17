// variable constant
// constant adalah immutable data, yang biasa diakses untuk global(global = diakses dimanapun)
// constan wajib menggunakan val dan ditulis diluar ataupun diluar main
const val AWAM = "masih belajar"
const val PASTI = "pasti sukses aminn"


fun main() {
    // variabel adalah tempat untuk menyimpan data
    // ada 2 variable
    // variabel mutable adalah variabel yang bisa diubah
    // variabel mutable menggunakan var

    var bisaubah: String = "belum diubah"
    println(bisaubah)
    bisaubah = "sudah di ubah"
    println(bisaubah)

    // variable immutable adalah variabel yang tidak bisa diubah isi nya
    // variable immutable menggunakan val

    val tidakubah = "ini tidak bisa diubah" // ohh iya ini menulis tipe data boleh ditulis ataupun tidak karna dia sudah tahu tipenya, tapi hanya string dan int saja mungkin
    val umur = 17
    println(tidakubah)
    println(umur)

    // lebih baik gunakan immutable dibanding mutable.
    val kosong = null // null artinya kosong

    // variable constant
    println("$AWAM dan $PASTI")

}