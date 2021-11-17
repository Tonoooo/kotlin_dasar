// jika Recursive Function yang kita buat saat dijalankan memanggil function dirinya sendiri-
// terlalu dalam, maka bisa dimungkinkan akan terjadi error stack overflow.
// masalah ini bisa ditangani dengan Tail Recursive Function
// Tail Recursive Function adalah teknik mengubah Recursive Function yang kita buat menjadi looping biasa ketika dijlankan
// tidak semua Recursive Function bisa secara otomatis dibuat menjadi Tail Recursive Function,ada syaratnya:
// ~ tambahkan tailrec di functionnya
// ~ saat memanggil function dirinya sendiri, hanya boleh memanggil function dirinya sendiri, tanpa embel embel operasi dengan data lain

fun main() {
    tailrec fun urutann(nilai: Int){ // tambah kan tailrec diawal
        println("urutan ke $nilai")
        if (nilai > 0){
            urutann(nilai - 1) // yang benar seperti seharusnya tanpa embel embel operasi dengan data lain
            // urutann(nilai - 1) * nilai atau nilia * urutann(nilai - 1) -> jangan seperti ini
        }
    }
    urutann(100)
}