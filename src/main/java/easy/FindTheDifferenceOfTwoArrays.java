package easy;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindTheDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> num1Collect = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> num2Collect = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        List<Integer> num1Result = num1Collect.stream()
                .filter(it -> !num2Collect.contains(it))
                .toList();
        List<Integer> num2Result = num2Collect.stream()
                .filter(it -> !num1Collect.contains(it))
                .toList();
        return List.of(num1Result, num2Result);
    }
}
