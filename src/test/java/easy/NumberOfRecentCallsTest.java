package easy;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfRecentCallsTest {
    public static Stream<Arguments> solution() {
        return Stream.of(
                Arguments.of(
                        new int[]{1}, 1
                ),
                Arguments.of(
                        new int[]{1, 100}, 2
                ),
                Arguments.of(
                        new int[]{1, 100, 3001}, 3
                ),
                Arguments.of(
                        new int[]{1, 100, 3001, 3002}, 3
                )
        );
    }

    @ParameterizedTest
    @MethodSource
    void solution(int[] inputs, Integer expected) {
        RecentCounter counter = new RecentCounter();
        int actual = 0;
        for (int i = 0; i < inputs.length; i++) {
            actual = counter.ping(inputs[i]);
        }
        assertEquals(expected, actual);
    }
}
