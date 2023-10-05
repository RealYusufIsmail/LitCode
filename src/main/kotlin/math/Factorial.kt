package math

object Factorial {
    @JvmStatic
    fun handleFactorial(n: Int): Int {
        if (n == 0) {
            return 1
        }

        return n * handleFactorial(n - 1)
    }

    @JvmStatic
    fun handleCombinations(n: Int, r: Int): Int {
        return handleFactorial(n) / (handleFactorial(n - r) * handleFactorial(r))
    }
}