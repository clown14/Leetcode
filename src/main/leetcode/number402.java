package main.leetcode;

import java.util.Stack;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-09-15 20:49
 **/

/*
num = “1234321”，k = 1，毫无疑问，当我们把数4删除掉时，得到的是最小的数字，我们发现“1234”是单调递增的，当“12343”时就不再是增的，那么我们把
“4”删除，就可以变成最小的了，那这是不是一个特例呢？我们再往下看样例
num = "1432219" , k = 3
1432219 “43”位置递减，将4删掉
132219 “32”位置递减，将3删掉
12219 “21”位置递减，将2删掉
最后结果1219
这说明从左到右找到第一个递减的位置，将前面的大数删掉的贪心思想是正确的，但是还有一种特殊的情况，num="123456789"，整个数字全部是递增的，我们完全
可以看出来，只需要把末尾删除即可。同时还要注意，不能有前导0，即”0220“，在最后的数字处理中要把前导0删掉，即“200”
*/
public class number402 {
    public String removeKdigits(String num, int k) {
        //贪心算法+栈
        if (k > num.length() || num.length() == 0) {
            return "0";
        }
        //栈顶始终是最大值
        Stack<Integer> stack = new Stack<>();
        stack.push(num.charAt(0) - '0');

        for (int i = 1; i < num.length(); i++) {
            int now = num.charAt(i) - '0';
            while (!stack.isEmpty() && now < stack.peek() && k > 0) {
                stack.pop();
                k--;
            }
            //不等于0可进你，等于0栈不空可进
            if (now != 0 || !stack.isEmpty()) {
                stack.push(now);
            }
        }
        //前面一直比后面小，去栈顶
        while (k > 0) {
            stack.pop();
            k--;
        }
        if (stack.isEmpty()) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}

    