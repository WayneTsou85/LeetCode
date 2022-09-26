package easy;

import common.ListNode;

public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != null) {
            fast = fast.next;
            if (fast == null || fast.next == null) {
                return slow.next;
            } else {
                fast = fast.next;
                slow = slow.next;
            }
        }
        return slow;
    }
}
