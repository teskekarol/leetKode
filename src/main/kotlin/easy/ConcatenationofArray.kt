package easy

class ConcatenationofArray {
    fun getConcatenation(nums: IntArray): IntArray {
        val inputSize = nums.size
        val ansArray = IntArray(inputSize*2)
        for (i in 0 until inputSize) {
            val temp = nums[i]
            ansArray[i] = temp
            ansArray[i+inputSize] = temp
        }
        return ansArray
    }

    fun getConcatenation2(nums: IntArray) = nums+nums

    fun getConcatenation3(nums: IntArray) = IntArray(nums.size * 2) { next -> nums[next % nums.size] }
}