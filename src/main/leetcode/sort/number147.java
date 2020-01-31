package main.leetcode.sort;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-01-31 15:10
 **/

/*
用指针 p 逐一向后遍历
0. 申请一个 dummyHead 节点，其下一个节点指向头结点。如果要在头结点出插入，dummyHead 会给我们带来便利
1. 当 p 的值不大于下一节点值，就进行遍历下一节点
2. 当 p 的值大于下一节点，那么就将p 的下一节点取出，从前向后扫描，在第一个比它的值大的节点之前插入该节点
 */

public class number147 {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummyHead = new ListNode(0), p = head;
        dummyHead.next = head;
        while (p.next != null) {
            if (p.val <= p.next.val) {
                p = p.next;
            } else {
                ListNode temp = p.next, q = dummyHead;
                p.next = p.next.next;
                while (q.next.val < temp.val) {
                    q = q.next;
                }
                temp.next = q.next;
                q.next = temp;
            }
        }
        return dummyHead.next;
    }
}

    