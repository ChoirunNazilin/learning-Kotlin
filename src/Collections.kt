fun main(args: Array<String>) {
    var map= hashMapOf("nama_depan" to "Choirun")
    map.put("nama_belakang","Nazilin")
    println(map.get("nama_belakang"))
    println(map["nama_belakang"])

    var ar= arrayOf(1,10,22,11)
    println(ar[0])
    var list= mutableListOf(11,22,33,22)
    list[0]=22
    for (item in list){
        println(item)
    }
}