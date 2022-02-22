package easy;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {

        var actualCounter = 0;

        for (int num : nums) {
            if (val == num) {
                actualCounter++;
            }
        }

        var savedCounter = actualCounter;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == val) {
                int lastEmptyIndex = nums.length - 1 + actualCounter - savedCounter;
                var temp = nums[lastEmptyIndex];
                nums[lastEmptyIndex] = val;
                nums[i] = temp;

                actualCounter--;
            }
        }
        return nums.length - savedCounter;
    }

}
