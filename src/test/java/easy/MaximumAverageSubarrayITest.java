package easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumAverageSubarrayITest {
    
    private final MaximumAverageSubarrayI solution = new MaximumAverageSubarrayI();

    public static Stream<Arguments> findMaxAverage() {
        return Stream.of(
                Arguments.of(
                        new int[]{1,12,-5,-6,50,3},
                        4,
                        12.75000
                ),
                Arguments.of(
                        new int[]{5},
                        1,
                        5.00000
                ),
                Arguments.of(
                        new int[]{-1},
                        1,
                        -1
                ),
                Arguments.of(
                        new int[]{7,4,5,8,8,3,9,8,7,6},
                        7,
                        7.00000
                ),
                Arguments.of(
                        new int[]{4,2,1,3,3},
                        2,
                        3.00000
                )
        );
    }
    
    @ParameterizedTest
    @MethodSource
    void findMaxAverage(int[] nums, int k, double expectedResult) {
        double maxAverage = solution.findMaxAverage(nums, k);
        assertEquals(expectedResult, maxAverage);
    }
}
