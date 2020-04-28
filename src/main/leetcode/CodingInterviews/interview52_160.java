package main.leetcode.CodingInterviews;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-04-28 15:59
 **/

/**
 * 先求出两个链表长度，若相等，则同时下移，若有节点相等，则返回若其中一个大于另一个链表，则将长的链表起始节点移动到与短链表起始位置相同的地方。
 */

public class interview52_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode node1=headA;
        ListNode node2=headB;
        int lenA=len(headA),lenB=len(headB);
        if(lenA>lenB){
            for(int i=0; i<lenA-lenB; i++){
                node1=node1.next;
            }
        }
        if(lenB>lenA){
            for(int i=0; i<lenB-lenA; i++){
                node2=node2.next;
            }
        }
        while(node1!=node2){
            node1=node1.next;
            node2=node2.next;
        }
        return node1;
    }

    private int len(ListNode head){
        int len = 0;
        while(head != null){
            head = head.next;
            len++;
        }
        return len;
    }
}

    