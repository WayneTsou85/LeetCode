package easy;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            int current = nums[index];
            while (index + 1 < nums.length && nums[index] + 1 == nums[index + 1]) {
                index++;
            }
            if (current == nums[index]) {
                result.add(String.valueOf(current));
            } else {
                result.add(String.format("%d->%d", current, nums[index]));
            }
        }
        return result;
    }
}
