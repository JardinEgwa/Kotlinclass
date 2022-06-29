class Fruits {
    var type=""
    var colour=""
    var price=0
}

fun main(args: Array<String>) {
    val matunda=Fruits()
    matunda.type="Pineapple"
    matunda.colour="Yellow"
    matunda.price=100

    println(matunda.type)
    println(matunda.colour)
    println(matunda.price)

    val matunda1=Fruits()
    matunda1.type="Oranges"
    matunda1.colour="Orange"
    matunda1.price=120

    println(matunda1.type)
    println(matunda1.colour)
    println(matunda1.price)

    val matunda2=Fruits()
    matunda2.type="Bananas"
    matunda2.colour="Yellow"
    matunda2.price=50

    println(matunda2.type)
    println(matunda2.colour)
    println(matunda2.price)
}
