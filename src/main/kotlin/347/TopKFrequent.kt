package `347`

class TopKFrequent {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val numbers = mutableListOf<Int>()
        // First Int is the number, second Int is the frequency
        val repatedNumers = mutableMapOf<Int, Int>()

        nums.forEach {
            if (numbers.contains(it)) {
                repatedNumers[it] = repatedNumers[it]!! + 1
            } else {
                numbers.add(it)
                repatedNumers[it] = 1
            }
        }

        val sortedNumbers = numbers.sortedByDescending { repatedNumers[it] }
        return sortedNumbers.subList(0, k).toIntArray()
    }
}