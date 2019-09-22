package main.leetcode;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-09-22 19:57
 **/

/*
利用一个栈来实现。首先将所有的元素倒叙压入栈中（倒叙入栈，输出顺序才是正序），由于迭代过程是先判断hasNext然后再next获取值，这样我们就可以在hasNest中进行处理：
首先判断栈顶元素是否为一个整数，若是，则证明next可以直接拿值，返回true；
若不是，则是一个嵌套，我们将该元素弹出并转化成一个列表，将列表中元素倒叙入栈。
重复上述过程直到栈顶元素是一个值为止。
 */

public class number341 {
    public class NestedIterator implements Iterator<Integer> {

        private Stack<NestedInteger> stack;

        public NestedIterator(List<NestedInteger> nestedList) {
            stack = new Stack<>();
            flattenList(nestedList);
        }

        @Override
        public Integer next() {
            return hasNext() ? stack.pop().getInteger() : null;
        }

        @Override
        public boolean hasNext() {
            while (!stack.isEmpty()) {
                if (stack.pop().isInteger()) {
                    return true;
                }
                flattenList(stack.pop().getList());
            }
            return false;
        }

        private void flattenList(List<NestedInteger> list) {
            for (int i = list.size() - 1; i >= 0; i--) {
                stack.push(list.get(i));
            }
        }
    }

}

    