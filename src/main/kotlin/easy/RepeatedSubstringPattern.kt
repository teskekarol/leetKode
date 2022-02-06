package easy

class RepeatedSubstringPattern {

    fun repeatedSubstringPattern(s: String): Boolean {
        val length = s.length
        for (i in 1..length / 2) {
            if (length % i != 0) {
                continue
            }
            val result = s.toList().windowed(i, i)
                .toSet()
                .size
            if (result == 1) {
                return true
            }
        }
        return false
    }

}