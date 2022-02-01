package easy

class BuildArrayfromPermutation {
    fun buildArray(nums: IntArray) = IntArray(nums.size) { next -> nums[nums[next]] }
}