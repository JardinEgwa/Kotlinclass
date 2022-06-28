import kotlin.math.sqrt

fun calculate() {
    var num1 = 60
    var num2 = 30
    println("The sum of $num1 and $num2 is " + (num1 + num2))
    println("The product of $num1 and $num2 is " + (num1 * num2))
    println("The quotient of $num1 and $num2 is " + (num1 / num2))
    println("The difference between $num1 and $num2 is " + (num1 - num2))
}
fun main(args: Array<String>) {
    calculate()
    jina()
    println (sqrt(64.0))
    magari("Blue","Subaru",2010)
}

fun jina(){
    println("My name is Jade")
}

fun magari (color:String, brand:String, Year:Int){
    println("My car is a $color $brand manufactured in the year $Year ")
}

