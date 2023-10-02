package `49`

class AnagramGroups {

    /**
     * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
     *
     * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
     *
     * Here we have a map called anagrams that will hold the sorted word as key and the list of anagrams as value.
     * We iterate over the array of words and sort each word. If the sorted word is already in the map, we add the word to the list of anagrams.
     * If the sorted word is not in the map, we create a new list of anagrams and add the word to it.
     * We then return the values of the map as a list of lists.
     */
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        //one can be empty if no anagram is found for a given word
        val anagrams = mutableMapOf<String, MutableList<String>>()

        for (word in strs) {
            val sortedWord = word.toCharArray().sorted().joinToString("")
            if (anagrams.containsKey(sortedWord)) {
                anagrams[sortedWord]?.add(word)
            } else {
                anagrams[sortedWord] = mutableListOf(word)
            }
        }

        return anagrams.values.toList()
    }
}