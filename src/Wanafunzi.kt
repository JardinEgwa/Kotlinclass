class Wanafunzi(val name:String,val Gender:String,var Phone:Int,val Course:String) {
}

fun main(args: Array<String>) {
    val obj=Wanafunzi("Jade","Female",3749305,"MIT")
    println("The student's name is "+obj.name +obj.Gender +obj.Phone +obj.Course)




}