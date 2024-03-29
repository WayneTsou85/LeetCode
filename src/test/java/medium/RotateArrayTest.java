package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {

    private final RotateArray solution = new RotateArray();

    public static Stream<Arguments> rotate() {
        return Stream.of(
                Arguments.of(
                        new int[]{1,2,3,4,5,6,7},
                        3,
                        new int[]{5,6,7,1,2,3,4}
                ),
                Arguments.of(
                        new int[]{-1,-100,3,99},
                        2,
                        new int[]{3,99,-1,-100}
                )
        );
    }

    @ParameterizedTest
    @MethodSource
    void rotate(int[] nums, int k, int[] expected) {
        solution.rotate(nums, k);
        assertEquals(Arrays.toString(expected), Arrays.toString(nums));
    }
}
