package main.leetcode.CodingInterviews;

import java.util.Stack;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-03-10 16:41
 **/

public class interview09 {
    class CQueue{
        private Stack<Integer> stack1;
        private Stack<Integer> stack2;

        public CQueue() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public void appendTail(int value) {
            stack1.push(value);
        }

        public int deleteHead(){
            if (stack1.isEmpty() && stack2.isEmpty()) {
                return -1;
            }
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        }
    }
}

    