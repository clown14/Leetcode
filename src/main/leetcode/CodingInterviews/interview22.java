package main.leetcode.CodingInterviews;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-03-27 23:50
 **/

/**
 *  前指针 former 先向前走 k 步（结束后，双指针 former 和 latter 间相距 k 步）。
 *  双指针共同移动： 循环中，双指针 former 和 latter 每轮都向前走一步，直至 former 走过链表 节点时跳出
 *  跳出后， latter 与尾节点距离为 k-1，即 latter 指向倒数第 k 个节点）。
 */

public class interview22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode former=head, latter=head;
        for(int i=0; i<k; i++){
            former=former.next;
        }
        while(former!=null){
            former=former.next;
            latter=latter.next;
        }
        return latter;
    }
}

    