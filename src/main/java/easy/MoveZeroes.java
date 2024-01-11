package easy;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int nonZeroIndex = i;
            if (nums[i] == 0) {
                while (nums[nonZeroIndex] == 0) {
                    nonZeroIndex++;
                    if (nonZeroIndex >= nums.length) return;
                }
                int zero = nums[i];
                int num = nums[nonZeroIndex];
                nums[i] = num;
                nums[nonZeroIndex] = zero;
            }
        }
    }
}
