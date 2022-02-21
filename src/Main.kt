fun main(){
    var sayHelloSylviah=("Hello Sylviah")
    println(sayHelloSylviah)
    modulus(27,5)
    var total = Sum(9, 7, 6, 5)
    println(total)
    printFact("Singing")
}

fun sayHelloSylviah(Name:String){
    println("Hello" + Name)


}

fun modulus(num1:Int, num2:Int): Int{
    var x = (num1 % num2)
    println(x)
    return x
}


   fun Sum(a: Int,b:Int,c:Int,d:Int):Int{
      var sum = a + b + c + d
    return sum
}

fun printFact(fact:String){
    println("I like $fact")
}


