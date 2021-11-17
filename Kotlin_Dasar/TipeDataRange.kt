fun main() {
    val berurutan = 1..100
    println(berurutan.count()) // count untuk mendapatkan data dirange
    println(berurutan.contains(50)) //contains(value) untuk mengecek apakah ada value tersebut
    println(berurutan.contains(200))
    println(berurutan.first) //mendapatkan nilai pertama
    println(berurutan.last) // mendapatkan nilai terakhir
    println(berurutan.step) // mendapatkan nilai tiap kenaikan

    // range terbalik

    val urutan = 100 downTo 1
    println(urutan.count()) // count untuk mendapatkan data dirange
    println(urutan.contains(50)) //contains(value) untuk mengecek apakah ada value tersebut
    println(urutan.contains(200))
    println(urutan.first) //mendapatkan nilai pertama
    println(urutan.last) // mendapatkan nilai terakhir
    println(urutan.step) // mendapatkan nilai tiap kenaikan

    // range dengan step
    val loncatan = 1..100 step 2
    println(loncatan.count()) // count untuk mendapatkan data dirange
    println(loncatan.contains(50)) //contains(value) untuk mengecek apakah ada value tersebut
    println(loncatan.contains(200))
    println(loncatan.first) //mendapatkan nilai pertama
    println(loncatan.last) // mendapatkan nilai terakhir
    println(loncatan.step) // mendapatkan nilai tiap kenaikan

}