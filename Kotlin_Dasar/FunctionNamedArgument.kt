// Named Argument adalah fitur dimana kita bisa menyebutkan nama parameter saat memanggil function,
// dengan demikian kita tidak wajib tahu posisi tiap parameter

fun fullnama(
    namapertama: String,
    namatengah: String,
    namaakhir: String
){
    println("hai $namapertama $namatengah $namaakhir")
}

fun main() {
    fullnama(
        namaakhir = "suep",
        namapertama = "rian",
        namatengah = "tono"
    )
}