/**
 * date       : 2022/6/29 上午 09:42
 * description:
 *
 *  * Definition for singly-linked list.
 *  * public class easy.ListNode {
 *  *     int val;
 *  *     easy.ListNode next;
 *  *     easy.ListNode() {}
 *  *     easy.ListNode(int val) { this.val = val; }
 *  *     easy.ListNode(int val, easy.ListNode next) { this.val = val; this.next = next; }
 *  * }
 *
 */
package easy;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}
