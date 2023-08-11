open class MpesaAccount (val phoneno:String, var balance:Double){
    open fun deposit(amount:Double){
        if (amount>0){
            balance += amount
            println("Deposited $amount into account $phoneno.New balance : $balance")
        }else{
            println("Invalid deposit")
        }
    }
    open fun withdraw(amount:Double){
        if (amount>0 && amount<=balance){
            println("Withdraw $amount from account $phoneno.balance : $balance")
        }else{
            println("Insufficient Balance")
        }
    }
}
class checkbalance(phoneno: String,balance: Double):MpesaAccount(phoneno,balance){
    fun sendmoney(receiverPhone: String, amount: Double){
        if (amount>0 && amount<=0){
            balance -=amount
            println("Sent $amount to acoount $receiverPhone. Balance : $balance")
        }else{
            println("Insufficient Balance")
        }
    }
}

fun main(args: Array<String>) {
    val useraccount=checkbalance("0722565789", 200.0)
    val receiveraccount=checkbalance("0723456789", 1000.0)

    useraccount.deposit(560.0)
    useraccount.withdraw(350.0)
    useraccount.sendmoney(receiveraccount.phoneno,50.0)
}