fun main() {
    // integer number
    var age: Int = 200
    println(age)

    var panjang: Long = 9000000000L // untuk tipe long harus diakhiri L
    println(panjang)

    // floating point number
    var contoh: Float = 10.10F //harus ujungnya dikasih F kalau gak nanti dikira tipe double bukan float
    println(contoh)

    var guna: Double = 2624564312.15324 // tipe double ini lebih banyak digunakan dari pada float
    println(guna)

    // Literals
    var inibinary: Int = 0b010110011 // untuk binary harus diawali 0b (nol dan b)
    println(inibinary)

    // Underscore
    var gakngaruh: Long = 7_000_000_000L // underscore ini tidak akan berpengaruh ini berfungsi untuk mudah dibaca saja
    println(gakngaruh)

    // Conversion
    var diubah: Double = inibinary.toDouble() // diubah 
    println(diubah)
}