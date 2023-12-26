package easy;

import common.ListNode;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;
import static utils.ListNodeUtil.createSampleNode;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MergeTwoSortedListsTest {

    MergeTwoSortedLists solution = new MergeTwoSortedLists();

    @Order(1)
    @Test
    void givenSample1_whenMergeTwoLists_thenAssertExpect() {
        // given
        ListNode list1 = createSampleNode(1, 2, 4);
        ListNode list2 = createSampleNode(1, 3, 4);
        // when
        ListNode mergeTwoLists = solution.mergeTwoLists(list1, list2);
        // then
        ListNode expected = createSampleNode(1, 1, 2, 3, 4, 4);
        assertEquals(expected, mergeTwoLists);
    }

    @Order(2)
    @Test
    void givenSample2_whenMergeTwoLists_thenAssertExpect() {
        // given
        ListNode list1 = null;
        ListNode list2 = null;
        // when
        ListNode mergeTwoLists = solution.mergeTwoLists(list1, list2);
        // then
        assertNull(mergeTwoLists);
    }

    @Order(3)
    @Test
    void givenSample3_whenMergeTwoLists_thenAssertExpect() {
        // given
        ListNode list2 = createSampleNode(0);
        // when
        ListNode mergeTwoLists = solution.mergeTwoLists(null, list2);
        // then
        assertEquals(createSampleNode(0), mergeTwoLists);
    }
}
