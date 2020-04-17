package main.leetcode.CodingInterviews;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-04-17 16:55
 **/

public class interview33 {
    public boolean verifyPostorder(int[] postorder) {
        Deque<Integer> stack= new LinkedList<>();
        int pervElem=Integer.MAX_VALUE;
        for(int i=postorder.length-1; i>=0; i--){
            if(postorder[i]>pervElem){
                return false;
            }
            while(!stack.isEmpty()&&postorder[i]<stack.peek()){
                pervElem=stack.pop();
            }
            stack.push(postorder[i]);
        }
        return true;
    }
}

    