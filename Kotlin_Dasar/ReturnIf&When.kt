fun main() {

    // return if
    //awalnya seperti ini jika tidak menggunakan return if
    fun salamm(namaa: String = ""): String{
        if (namaa == "") {
            return "hai kawann!"
        }else{
            return "hai $namaa"
        }
    }
    println(salamm())
    println(salamm("rian"))



    // jadi lebih singkat menggunakan return if
    fun salam(nama: String = ""): String{
        return if (nama == "") {
            "hai kawan!"
        }else{
            "hai $nama"
        }
    }
    println(salam())
    println(salam("tono"))






    //return when
    //awalnya seperti ini jika tidak menggunakan when if
    fun salamann(nama: String = ""): String{
        when(nama){
            "" -> return "hai babyy"
            else -> return "hai $nama"
        }
    }
    println(salamann())
    println(salamann("rian"))



    // jadi lebih singkat menggunakan when if
    fun salaman(nama: String = ""): String{
        return when(nama){
            "" -> "hai baby"
            else -> "hai $nama"
        }
    }
    println(salaman())
    println(salaman("rian"))

    // bisa menonton videonya di penyimpanan komputer ini E:\belajar\code\kotlin\VideoTutorialKotlin
}