package math

import math.Factorial.handleCombinations
import kotlin.math.pow

object BinomailExpansion {

    @JvmStatic
    fun handleBinomailExpansion(a: Int, b: Char, power : Int): Int {
        var res = 0
        for (i in 0..power) {
            res += handleCombinations(power, i) * a.toDouble().pow((power - i).toDouble()).toInt() * b.code.toDouble()
                .pow(i.toDouble()).toInt()
        }
        return res
    }
}