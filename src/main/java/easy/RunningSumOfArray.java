/**
 * date       : 2022/6/24 下午 05:54
 * description: 1480. Running Sum Of 1D Array
 */
package easy;

public class RunningSumOfArray {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                result[i] = nums[i];
            } else {
                result[i] = nums[i] + result[i-1];
            }
        }
        return result;
    }
}
