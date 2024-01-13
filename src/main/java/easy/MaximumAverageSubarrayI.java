package easy;

public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        if (nums.length == 1) return nums[0] * 1.0;
        int result = 0;
        for(int i = 0; i < k; i ++){
            result += nums[i];
        }
        int currentWindow = result;
        System.out.println("Initial window Value >>> " + currentWindow);
        for (int i = k; i < nums.length; i++) {
            System.out.println(String.format("Current window = %d (+) nums[i] = %d (-) nums[i-k] = %d", currentWindow, nums[i], nums[i - k]));
            currentWindow = currentWindow + nums[i] - nums[i - k];
            System.out.println(String.format("Current window = % d", currentWindow));
            result = Math.max(result, currentWindow);
            System.out.println("Compare Temp Result And Current Window >>> " + result);
        }
        return (double) result / k;
    }

}
