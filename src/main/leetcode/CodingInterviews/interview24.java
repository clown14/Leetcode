package main.leetcode.CodingInterviews;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-03-29 18:36
 **/

/**
 * 定义两个指针： pre 和 cur ；pre 在前 cur 在后。
 * 每次让 pre 的 next 指向 cur ，实现一次局部反转局部反转完成之后，
 * pre 和 cur 同时往前移动一个位置循环上述过程，直至 pre 到达链表尾部
 */

public class interview24 {
    public ListNode reverseList(ListNode head) {
        ListNode cur = null, pre = head;
        while (pre != null) {
            ListNode t = pre.next;
            pre.next = cur;
            cur = pre;
            pre = t;
        }
        return cur;
    }
}

    