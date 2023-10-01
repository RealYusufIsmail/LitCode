package `1`

class TwoSumsSultions {

    /**
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     *
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     *
     * The map has Int which is the number and Int which is the position.
     * The for loop is used to iterate over the array of numbers.
     * The number is the current number in the array.
     * The position is the current position in the array.
     *
     * The target minus the number is the number that we are looking for.
     * If the map contains the number that we are looking for, then we have found the two numbers that add up to the target.
     */
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val numberAndPosition = mutableMapOf<Int, Int>()

        for (i in nums.indices) {
            val number = nums[i]
            val position = numberAndPosition[number]
            if (position != null) {
                return intArrayOf(position, i)
            }
            numberAndPosition[target - number] = i
        }


        return intArrayOf()
    }
}