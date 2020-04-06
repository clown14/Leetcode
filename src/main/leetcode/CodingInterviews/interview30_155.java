package main.leetcode.CodingInterviews;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-04-06 14:54
 **/

/**
 * 这道题可以抽象成一个多叉树的遍历：
 * 首先遍历员工表，将员工的id作为键，员工对象作为值存入一个map中。
 * 然后把题中给出的id对应的员工看作是根节点，然后进行所有孩子节点的遍历，将他们的重要值累加起来并返回。
 */
public class interview30_155 {
    class MinStack {

        private Node head;

        public void push(int x) {

            if (head == null)
                head = new Node(x, x, null);
            else
                head = new Node(x, Math.min(head.min, x), head);
        }

        public void pop() {

            head = head.next;
        }

        public int top() {

            return head.val;
        }

        public int getMin() {

            return head.min;
        }

        private class Node {

            int val;
            int min;
            Node next;

            public Node(int val, int min, Node next) {

                this.val = val;
                this.min = min;
                this.next = next;
            }
        }
    }
}

    