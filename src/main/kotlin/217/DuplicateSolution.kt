package `217`

class DuplicateSolution {

    /**
     * We do a for loop where we from the start till the end. With this for loop we check if the set which has been created contains a duplicate number.
     * If it does not it adds that number to the set and rebates until the end of the array. If there is no duplicate it will return false.
     */
    fun containsDuplicate(nums: IntArray): Boolean {
        val set = mutableSetOf<Int>()
        for (i in nums) {
            if (set.contains(i)) {
                return true
            }
            set.add(i)
        }

        return false
    }
}