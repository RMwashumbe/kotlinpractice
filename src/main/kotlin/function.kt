fun robert(){
    println("This is a user-defined Function")
}
fun main(args: Array<String>) {
    robert()
    robert()
    arith()
}
fun arith(){
    var num=4
    var num2=67
    println("The sum of $num and $num2 is : ${num+num2}")
    println("The product of $num and $num2 is : ${num*num2}")
    println("The quotient of $num and $num2 is : ${num/num2}")
    println("The difference of $num and $num2 is : ${num-num2}")
}