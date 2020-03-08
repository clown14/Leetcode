package main.leetcode.CodingInterviews;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-03-08 15:46
 **/

import java.util.Stack;

/**
 * 使用栈将链表元素顺序倒置。从链表的头节点开始，依次将每个节点压入栈内，然后依次弹出栈内的元素并存储到数组中。
 */

public class interview06 {
    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        int size = stack.size();
        int[] point = new int[size];
        for (int i = 0; i < size; i++) {
            point[i] = stack.pop().val;
        }
        return point;
    }
}




    