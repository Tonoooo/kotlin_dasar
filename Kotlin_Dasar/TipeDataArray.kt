// array adalah tipe data yang berisikan kumpulan data dengan tipe yang sama

fun main() {
    val anggota: Array<String> = arrayOf("tono", "suep", "rian")
    val nilai: Array<Byte> = arrayOf(100, 90, 95)
    val harga: Array<Int> = arrayOf(10_000, 5000, 20_000)

    //cara mengakses
    println(anggota[0]) // index dimulai dari nol dan awal
    println(anggota[1])
    println(harga[2])

    //cara merubah isinya
    anggota.set(0, "berkah") // ingat yang tidak bisa dilakukan di val itu merubah variablenya, ini kita hanya merubah isinya saja
    anggota[1] = "sejahtera" //cara lain untuk mengubahnya
    println(anggota[0])
    println(anggota[1])

    // array nullable
    // null adalah kosong

    val bebas: Array<String?> = arrayOfNulls(10) // 10 itu maksudnya jumlahnya / jumlah anggota, dan tandatanya(?) itu artinya boleh null
    println(bebas[0])
    // masukan daisinya
    bebas[0] = "tono"
    bebas[1] = "tono"
    bebas[2] = "tono"
    bebas[3] = null
    bebas[4] = "tono"
    bebas[5] = "tono"

    println(bebas[3])
    println(bebas.size)
}