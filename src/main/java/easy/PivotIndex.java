package easy;

import java.util.stream.IntStream;

public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int sum = IntStream.of(nums).sum();
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != 0) leftSum += nums[i - 1];
            int withoutIndex = sum - nums[i];
            if ((withoutIndex % 2 == 0) && (leftSum == withoutIndex/2)) return i;
        }
        return -1;
    }
}
