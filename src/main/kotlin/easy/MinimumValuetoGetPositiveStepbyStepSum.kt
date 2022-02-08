package easy

class MinimumValuetoGetPositiveStepbyStepSum {

    fun minStartValue(nums: IntArray): Int {
        var min = 1
        var sum = 0

        return nums.forEach { num ->
            sum += num
            if (sum < min) {
                min = sum
            }
        }
            .run {
                if (min == 1) {
                    1
                } else {
                    1 - min
                }
            }


    }
}