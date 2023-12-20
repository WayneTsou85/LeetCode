package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SummaryRangesTest {

    private static final SummaryRanges SUMMARY_RANGES = new SummaryRanges();

    public static Stream<Arguments> summaryRangesTestCase() {
        return Stream.of(
                Arguments.of(
                        new int[]{0,1,2,4,5,7},
                        List.of("0->2","4->5","7")
                ),
                Arguments.of(
                        new int[]{0,2,3,4,6,8,9},
                        List.of("0","2->4","6","8->9")
                )
        );
    }

    @ParameterizedTest
    @MethodSource("summaryRangesTestCase")
    void summaryRanges(int[] nums, List<String> expectedResult) {
        List<String> actual = SUMMARY_RANGES.summaryRanges(nums);
        Assertions.assertEquals(expectedResult, actual);
    }
}
