package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {

    private final MergeSortedArray solution = new MergeSortedArray();

    public static Stream<Arguments> mergeTest() {
        return Stream.of(
                Arguments.of(
                        new int[]{1, 2, 3, 0, 0, 0},
                        3,
                        new int[]{2, 5, 6},
                        3,
                        new int[]{1, 2, 2, 3, 5, 6}
                ),
                Arguments.of(
                        new int[]{1},
                        1,
                        new int[]{},
                        0,
                        new int[]{1}
                ),
                Arguments.of(
                        new int[]{0},
                        0,
                        new int[]{1},
                        1,
                        new int[]{1}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("mergeTest")
    void merge(int[] nums1, int m, int[] nums2, int n, int[] expectedResult) {
        solution.merge(nums1, m, nums2, n);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(nums1));
    }
}
