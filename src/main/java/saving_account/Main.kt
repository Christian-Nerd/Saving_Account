package saving_account

import kotlin.system.exitProcess

fun main() {
    println("What is your principal for your savings account? [Default: 0]")
    val principle = readLine()?.toDouble() ?: 0.0
    println("""
        What interest rate do you choose?
        
        8% interest every 4 months or 1% interest every 1 month?
        Type 8% to get 8% interest every 4 months or
        Type one percent to get 1% interest every month
    """.trimIndent())
    val variableInputNewline = readLine() ?: ""
    var rate = 0.0
    // Time In years for the compound interest formula
    var time = 0.0
    // This is the rate which interest compounds out of a year i.e 4 times a year or 365 times a year.......
    var compoundInterest = 0.0
    when (variableInputNewline.uppercase()) {
        "8", "8%", "8 PERCENT", "EIGHT PERCENT" -> {
            rate = 8.0
            compoundInterest = 3.0
            println("Okay then......done")
        }
        "1", "1%", "1 PERCENT", "ONE PERCENT" -> {
            rate = 1.0
            compoundInterest = 12.0
            println("Okay then......done")
        }
    }

    // This runs the main part of the program the calculator for compound interest.
    println("Do you want to use a calculator for calculating your compound interest? Y/N")
    val savingAccount = SavingAccount(principle, rate, compoundInterest, time)
    when (readLine()?.uppercase()) {
        "Y", "YES" -> {
            println("How many years are you going to keep your money in the bank? [Default: 5]")
            time = readLine()?.toDouble() ?: 5.0
            savingAccount.interest(principle, rate, compoundInterest, time)
        }
        "N", "NO" -> println("Continue setting up your savings account")
    }

    println("""
        Choose:
        Stop
        Withdrawal
        Deposit
    """.trimIndent())
    val choice = readLine()
    when (choice?.uppercase()) {
        "1", "STOP" -> exitProcess(0)
        "2", "WITHDRAWAL" -> {
            println("How much money do you want to withdrawal? [Default: 10]")
            savingAccount.withdrawal(readLine()?.toDouble() ?: 10.0)
        }
        "3", "DEPOSIT" -> {
            println("How much money to you want to deposit. [Default: 10]")
            savingAccount.deposit(readLine()?.toDouble() ?: 10.0)
        }
    }
}