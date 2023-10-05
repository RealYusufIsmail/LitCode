package `238`

class ProductExceptSelf {

    /**
     * We get a list of numbers. For each number, we time the rest the number in the list apart from itself.
     */
    fun productExceptSelf(nums: IntArray): IntArray {
        // We will use a prefix and suffix array to store the product of the numbers before and after the current number
        val res = IntArray(nums.size)

        var prefix = 1
        for (i in nums.indices) {
            res[i] = prefix
            prefix *= nums[i]
        }
        var postfix = 1
        for (i in nums.size - 1 downTo 0) {
            res[i] *= postfix
            postfix *= nums[i]
        }

        return res
    }
}