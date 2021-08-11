package saving_account

import kotlin.math.pow

// Wallet is for personal money
class SavingAccount(var principle: Double, var rate: Double, var compoundInterest: Double, var time: Double) {
    var wallet = 0.0
    var f = 0.0

    //This is for the compound interest formula.
    fun interest(principle: Double, rate: Double, compoundInterest: Double, time: Double): Double {
        // time is the variable for how many years have passed in percentage
        val futureValue = (principle * (1 + rate / compoundInterest)).pow(time * compoundInterest)
        // future values in the formula P(r + n/r)
        println(futureValue)
        return futureValue.also { f = it }
    }

    fun deposit(D: Double): Double {
        return D.let { principle += it; principle }
    }

    fun withdrawal(WD: Double): Double {
        return WD.coerceAtMost(wallet).let { principle -= it; principle }
    }
}