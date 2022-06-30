open class parent {
    var num=60
    var jina="Jade"
}

class chld:parent(){
    fun display(){
        println("The number from my parent class is $num")
    }

}

class child1:parent(){
    fun display1(){
        println("My name is $jina")
    }
}

fun main(args: Array<String>) {
    var obj=chld()
    println(obj.display())

    var myobj=child1()
    println(myobj.display1())
}