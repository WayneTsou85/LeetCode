package easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {

    private final MoveZeroes moveZeroes = new MoveZeroes();

    public static Stream<Arguments> moveZeroes() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 0, 3, 12}, new int[]{1, 3, 12, 0, 0}),
                Arguments.of(new int[]{0}, new int[]{0})
        );
    }

    @ParameterizedTest
    @MethodSource
    void moveZeroes(int[] nums, int[] expectedResult) {
        moveZeroes.moveZeroes(nums);
        assertEquals(Arrays.toString(nums), Arrays.toString(expectedResult));
    }
}
