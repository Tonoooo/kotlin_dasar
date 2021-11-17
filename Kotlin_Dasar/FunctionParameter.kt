// saat sedang membuat function, kadang kadang kita membutuhkan data dari luar atau kita sebu parameter

fun salam(nama: String){ // nama:string ini adalah parameter
    println("hai $nama")
}

fun salaman(namaPertama: String, namaKedua: String?){   // String? disini tandatanya ? artinya boleh null
    if (namaKedua == null){
        println("hai $namaPertama")
    }else{
        println("hai $namaPertama $namaKedua")
    }
}

fun main() {
    salam("tono")
    salaman("tono", null)
    salaman("tono", "suep")
}