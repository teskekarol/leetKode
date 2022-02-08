package easy

class MinimumValuetoGetPositiveStepbyStepSum {

    fun minStartValue(nums: IntArray): Int {
        var min = 0
        var sum = 0

        nums.forEach { num ->
            sum += num
            min = min.coerceAtMost(sum)
        }
            .run {
                return 1 - min
            }


    }
}