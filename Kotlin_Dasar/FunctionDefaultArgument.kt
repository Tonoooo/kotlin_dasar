// Function Default Argument adalah tidak wajib diisi


fun halo(pertama: String, terakhir: String = ""){     // kode kuncinya adalah = ""
    println("halo $pertama $terakhir")
}


fun hai(namaSatu: String, namaDua: String? = null){   // kode kuncinya adalah =
    if (namaDua == null){
        println("hai $namaSatu")
    }else{
        println("hai $namaSatu $namaDua")
    }
}

fun main() {
    hai("tono")
    hai("tono", null)
    hai("tono", "suep")
    halo("rian")
    halo("rian", "tono")
}