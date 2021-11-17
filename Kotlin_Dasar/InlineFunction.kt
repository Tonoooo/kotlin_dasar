/**
 * menggunakan higher order function adalah salah satu fitur yang sangat berguna.
 * namun penggunaan higher order function akan berdampak terhadap peforma saat aplikasi berjalan-
 * karena harus membuat objek lambda berulang ulang . jika penggunaannya tidak terlalu-
 * banyak mungkin tidak akan terasi, tapi jika banyak sekali, maka akan terasa impactnya.
 *
 * inline function adalah kemampuan dikotlin yang mengubah higher order function menjadi Inline Function.
 * dimana dengan Inline Function, kode didalam higher order function akan di duplicate agar pada-
 * saat runtime, aplikasi tidak perlu membuat abject lambda berulang ulang
 */


inline fun haaloo(nama: () -> String): String{
    return "halo ${nama()}"
}

// noinline
// saat menandai bahwa function adalah inline, maka secara otomatis semua parameter akan menjadi inline.
// jika kita ingin memberi tahu bahwa jangan melakukan inline terhadap parameter,kita bisa-
// menandai parameter tersebut dengan kata kunci noinline


inline fun haaii(
    firstName: () -> String,
    noinline lastName: () -> String   // noinline
): String{
    return "hai ${firstName()} ${lastName()}"
}


fun main() {
    println(haaloo { "tono" })
    println(haaloo { "suep" })



    for (i in 0..100){
        println(haaii({ "tono" }, { "suep" }))
    }
}