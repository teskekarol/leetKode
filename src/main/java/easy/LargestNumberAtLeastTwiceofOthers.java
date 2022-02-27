package easy;

import java.util.Arrays;

public class LargestNumberAtLeastTwiceofOthers {

    public int dominantIndex(int[] nums) {
        var max = Integer.MIN_VALUE;
        var maxIndex = -1;
        var previousMax = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            var value = nums[i];

            if (value > max) {
                previousMax = max;
                max = value;
                maxIndex = i;
            }

            if (value < max && value > previousMax) {
                previousMax = value;
            }
        }
        return max / 2 >= previousMax ? maxIndex : -1;
    }


}
