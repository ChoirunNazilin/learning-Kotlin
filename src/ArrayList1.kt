fun main(args: Array<String>) {
    var arraylist= ArrayList<String>()
    arraylist.add("Choirun")
    arraylist.add("Nazilin")
    arraylist.add("Jepara")

    println("First name : "+arraylist.get(0))

    println("all element by object")
    for (item in arraylist){
        println(item)
    }

    arraylist.set(0,"Unisnu Jepara")
    println("all elemen by index")
    for(index in 0..arraylist.size-1){
        println(arraylist.get(index))
    }

    //search
    if (arraylist.contains("Hussein")){
        println("name is found")
    }else{
        println("name is not found")
    }
}