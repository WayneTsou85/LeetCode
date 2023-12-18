package easy;

import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums2.length == 0) return;
        int num1Pointer = m - 1;
        int num2Pointer = n - 1;
        int currentPointer;
        for (int pointer = nums1.length; pointer > 0; pointer--) {
            currentPointer = pointer - 1;
            if (num1Pointer < 0) {
                nums1[currentPointer] = nums2[num2Pointer];
                num2Pointer--;
                continue;
            } else if (num2Pointer < 0) {
                nums1[currentPointer] = nums1[num1Pointer];
                num1Pointer--;
                continue;
            }
            if (nums2[num2Pointer] >= nums1[num1Pointer]) {
                nums1[currentPointer] = nums2[num2Pointer];
                num2Pointer--;
            } else {
                nums1[currentPointer] = nums1[num1Pointer];
                num1Pointer--;
            }
        }
    }

}
