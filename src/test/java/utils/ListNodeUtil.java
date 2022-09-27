/**
 * date       : 2022/7/4 下午 03:30
 * description:
 */
package utils;

import common.ListNode;

public class ListNodeUtil {

    public static ListNode createSampleNode(int... vals) {
        ListNode rootNode = null;
        ListNode currentNode = null;
        for (int val : vals) {
            if (rootNode == null) {
                rootNode = new ListNode(val);
            } else {
                if (currentNode == null)  {
                    currentNode = new ListNode(val);
                    rootNode.next = currentNode;
                } else {
                    currentNode.next = new ListNode(val);
                    currentNode = currentNode.next;
                }

            }
        }
        return rootNode;
    }

    public static ListNode cycleListNode(ListNode head, int pos) {
        if (-1 == pos) {
            return head;
        }
        ListNode currentNode = head;
        ListNode detectNode = null;
        int counter = 0;
        while (true) {
            if (counter == pos) {
                detectNode = currentNode;
            }
            counter++;
            if (currentNode.next == null) {
                currentNode.next = detectNode;
                break;
            }
            currentNode = currentNode.next;
        }
        return head;
    }
}
