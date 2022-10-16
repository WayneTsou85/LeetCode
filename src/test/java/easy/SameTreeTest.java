package easy;

import common.TreeNode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SameTreeTest {

    private final SameTree tree = new SameTree();

    @ParameterizedTest
    @MethodSource("isSameSource")
    void isSameTree(TreeNode p, TreeNode q, boolean expect) {
        // given
        // when
        boolean result = tree.isSameTree(p, q);
        // then
        assertEquals(expect, result);
    }

    private static Stream<Arguments> isSameSource() {
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        return Stream.of(
                Arguments.of(new TreeNode(1, two, three), new TreeNode(1, two, three), true),
                Arguments.of(new TreeNode(1, two, null), new TreeNode(1, null, two), false),
                Arguments.of(new TreeNode(1, two, one), new TreeNode(1, one, two), false)
        );
    }
}