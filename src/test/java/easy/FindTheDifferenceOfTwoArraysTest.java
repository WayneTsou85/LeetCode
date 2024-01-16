package easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheDifferenceOfTwoArraysTest {

    private final FindTheDifferenceOfTwoArrays solution = new FindTheDifferenceOfTwoArrays();

    public static Stream<Arguments> findDifference() {
        return Stream.of(
                Arguments.of(
                        new int[]{1,2,3},
                        new int[]{2,4,6},
                        List.of(List.of(1,3), List.of(4,6))
                ),
                Arguments.of(
                        new int[]{1,2,3,3},
                        new int[]{1,1,2,2},
                        List.of(List.of(3), Collections.EMPTY_LIST)
                )
        );
    }

    @ParameterizedTest
    @MethodSource
    void findDifference(int[] nums1, int[] nums2, List<List<Integer>> expectedResult) {
        List<List<Integer>> result = solution.findDifference(nums1, nums2);
        assertEquals(expectedResult, result);
    }
}
