package math

import kotlin.math.pow

object GenericMath {

    @JvmStatic
    fun handlePower(number: Double, power : Int): Number {
        return number.pow(power.toDouble())
    }
}