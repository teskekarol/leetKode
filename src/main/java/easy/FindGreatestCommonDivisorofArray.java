package easy;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindGreatestCommonDivisorofArray {

    public int findGCD2(int[] nums) {
        var min = Integer.MAX_VALUE;
        var max = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return gcd(min, max);
    }

    public int findGCD(int[] nums) {
        return Optional.of(Arrays.stream(nums)
                .boxed()
                .collect(Collectors.summarizingInt(Integer::intValue)))
                .map(stats -> gcd(stats.getMin(), stats.getMax()))
                .get();
    }

    private int gcd(int first, int second) {
        if (second == 0) return first;
        else {
            return gcd(second, first % second);
        }
    }

}
