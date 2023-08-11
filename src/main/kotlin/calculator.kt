fun complexcal(){
    println("Complex Calculator")
    print("Enter the first Number")
    val num1= readln()?.toDoubleOrNull()

    print("Enter the Operator (+,-,*,/): ")
    val operator= readln()

    print("Enter the second Number")
    val num2= readln()?.toDoubleOrNull()

    if (num1==null||operator==null||num2==null){
        println("Invalid input. Please put correct numbers and operators")
        return
    }
 val results= when (operator){
     "+" -> num1 + num2
     "-" -> num1 - num2
     "*" -> num1 * num2
     "/" -> if (num2 != 0.0) num1 / num2 else "You can not divide by zero"
     else -> "Invalid operator"
 }
 println("Answer is $results")
}
fun main(args: Array<String>) {
    complexcal()
}