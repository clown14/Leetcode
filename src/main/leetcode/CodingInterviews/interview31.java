package main.leetcode.CodingInterviews;

import java.util.Stack;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-04-07 14:40
 **/

/**
 * 判断合不合法，用个栈试一试:
 * 把压栈的元素按顺序压入，当栈顶元素和出栈的第一个元素相同，则将该元素弹出，出栈列表指针后移并继续判断。最后判断出栈列表指针是否指向出栈列表的末尾即可。
 */

public class interview31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack();
        int j = 0;
        for (int elem : pushed) {
            stack.push(elem);
            while (j < popped.length && !stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }
        return j == popped.length;
    }
}

    