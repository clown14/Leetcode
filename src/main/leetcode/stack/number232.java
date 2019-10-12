package main.leetcode.stack;

import java.util.Stack;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-09-19 11:06
 **/

/*
对于队列来说，每次push都是将元素放入尾部，而栈每次放入头部，因此我们可以维护两个栈，stack1(存放元素的栈)和stack2(辅助栈),每次元素入栈，
将stack1的所有元素pop入stack2，将新元素放入栈，然后将stack2的所有元素pop入stack1.
这样也就使得新入栈的元素放入了尾部，而之前入栈的元素访问的顺序不变
 */

public class number232 {
    class MyQueue {
        int front;
        Stack<Integer> stack1;
        Stack<Integer> stack2;

        public MyQueue() {
            front = -1;
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public void push(int x) {
            if (stack1.empty()) {
                front = x;
            }
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
            stack1.push(x);
            while (!stack2.empty()) {
                stack1.push(stack2.pop());
            }
        }

        public int pop() {
            int num = stack1.pop();
            if (!stack1.empty()) {
                front = stack1.peek();
            }
            return num;
        }

        public int peek() {
            return front;
        }

        public boolean empty() {
            return stack1.empty();
        }
    }
}

    