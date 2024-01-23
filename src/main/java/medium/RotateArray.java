package medium;

import java.util.Arrays;

public class RotateArray {

    public void rotate(int[] nums, int k) {
        if (k == 0) return;
        int rotateElement = nums[nums.length - 1];
        for (int i = nums.length - 1; i - 1>= 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = rotateElement;
        k = k-1;
        rotate(nums, k);
    }
}
