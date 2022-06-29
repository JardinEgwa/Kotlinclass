class Marks {
//    data member
    var num1:Int=60
    var num2:Int=90

//    member function
    fun arithmetic():Int{
        return num1+num2
        }
}

fun main(args: Array<String>) {
//    creating an object

    val myobject=Marks()
    println(myobject.arithmetic())
}