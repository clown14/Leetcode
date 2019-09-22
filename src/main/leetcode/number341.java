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

    