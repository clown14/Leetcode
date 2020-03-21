package main.leetcode.CodingInterviews;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-03-21 14:29
 **/

public class interview18 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode root = new ListNode(0);
        root.next = head;
        ListNode res = root;
        while (root != null && root.next != null) {
            if (root.next.val != val) {
                root.next = root.next.next;
                break;
            }
            root=root.next;
        }
        return res.next;
    }
}

    