package `242`

class AnagramSolution {

    /**
     * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
     *
     * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
     *
     * The map has Char which is the letter and Int which is the count of the letter.
     */
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val mapOfLettersForS = mutableMapOf<Char, Int>()

        for (i in s.indices) {
            val letter = s[i]
            val count = mapOfLettersForS[letter] ?: 0
            mapOfLettersForS[letter] = count + 1
        }

        val mapOfLettersForT = mutableMapOf<Char, Int>()

        for (i in t.indices) {
            val letter = t[i]
            val count = mapOfLettersForT[letter] ?: 0
            mapOfLettersForT[letter] = count + 1
        }

        return mapOfLettersForS == mapOfLettersForT
    }
}