fun main() {

    // for array
    var nama = arrayOf("rian", "tono", "suep")
    var total = 0
    for (anggota in nama){
        println(anggota)
        total++
    }
    println("total perulangan = $total")
    // for range
    for (angka in 0..100){
        println(angka)
    }
    for (turun in 100 downTo 0 step 2){
        println(turun)
    }


    val ukuranarray = nama.size - 1
    for (i in 0..ukuranarray){ // i itu namanya
        println("index $i = ${nama.get(i)}")
    }
}