fun main(args: Array<String>) {
    var cars="Mercedes"

    when(cars){
        "Nissan" -> println("My car is Nissan")
        "Mercedes" -> println("My car is Mercedes")
        "Porsche" -> println("My car is Porsche")
        else -> println("Invalid input")
    }

    for (n in 1..5){
        println("before continue, Loop: $n")
        if(n==2||n==4)
            continue

        println("after continue, Loop: $n")

    }

    
}