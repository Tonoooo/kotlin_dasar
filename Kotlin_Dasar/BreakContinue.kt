fun main() {

    //Break & Continue adalah kata kunci yang bisa digunakan dalam semua perulangan kotlin
    //break digunakan untuk menghentikan seruluh perulangan
    //continue digunakan untuk menghentikan perulangan yang berjalan, dan langsung melanjutkan ke perulangan selanjutnya

    // break
    var i = 0
    while (true){
        println("ini yang ke $i")
        i++

        if (i > 1000){
            break
        }
    }

    // continue
    for (i in 1..1000){
        if (i % 2 == 0){
            continue
        }
        println("angka $i")
    }
}