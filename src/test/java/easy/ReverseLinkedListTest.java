package easy;

import common.ListNode;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static utils.ListNodeUtil.createSampleNode;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ReverseLinkedListTest {

    ReverseLinkedList solution = new ReverseLinkedList();

    @Order(1)
    @Test
    public void givenSample1_whenReverseList_thenAssertExpect() {
        // given
        ListNode node = createSampleNode(1, 2, 3, 4, 5);
        // when
        ListNode reverseNode = solution.reverseList(node);
        // then
        ListNode expected = createSampleNode(5,4,3,2,1);
        assertEquals(expected, reverseNode);
    }

    @Order(2)
    @Test
    public void givenSample2_whenReverseList_thenAssertExpect() {
        // given
        ListNode node = createSampleNode(1, 2);
        // when
        ListNode reverseNode = solution.reverseList(node);
        // then
        ListNode expected = createSampleNode(2,1);
        assertEquals(expected, reverseNode);
    }

    @Order(3)
    @Test
    public void givenSample3_whenReverseList_thenAssertExpect() {
        // given
        ListNode node = null;
        // when
        ListNode reverseNode = solution.reverseList(node);
        // then
        assertNull(reverseNode);
    }
}