fun main(args: Array<String>) {
   var map=HashMap<Int,String>()
    map.put(1,"Choirun")
    map.put(2,"Nazilin")
    println(map.get(2))

    map.put(2,"Unisnu Jepara")
    for (k in map.keys){
        println(map.get(k))
    }
}