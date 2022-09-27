package medium;

import common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static utils.ListNodeUtil.createSampleNode;
import static utils.ListNodeUtil.cycleListNode;

class LinkedListCycleIITest {

    LinkedListCycleII solution = new LinkedListCycleII();

    @Test
    void testDetectCycle_example1() {
        // given
        ListNode sampleNode = createSampleNode(3, 2, 0, -4);
        ListNode given = cycleListNode(sampleNode, 1);
        // when
        ListNode detectCycle = solution.detectCycle(given);
        // then
        assertEquals(2, detectCycle.val);
    }

    @Test
    void testDetectCycle_example2() {
        // given
        ListNode sampleNode = createSampleNode(1, 2);
        ListNode given = cycleListNode(sampleNode, 0);
        // when
        ListNode detectCycle = solution.detectCycle(given);
        // then
        assertEquals(1, detectCycle.val);
    }

    @Test
    void testDetectCycle_example3() {
        // given
        ListNode sampleNode = createSampleNode(1);
        ListNode given = cycleListNode(sampleNode, -1);
        // when
        ListNode detectCycle = solution.detectCycle(given);
        // then
        assertNull(detectCycle);
    }
}