package main.leetcode.greedy;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-10-13 19:47
 **/

public class number984 {
    class Solution {
        public String strWithout3a3b(int A, int B) {
            StringBuilder res = new StringBuilder();
            while (A > 0 || B > 0) {
                boolean write_A = false;
                int curLen = res.length();
                if (curLen > 1 && res.charAt(curLen - 1) == res.charAt(curLen - 2)) {
                    if (res.charAt(curLen) == 'b') {
                        write_A = true;
                    }
                }
                if (A >= B) {
                    write_A = true;
                }
                if (write_A) {
                    res.append('a');
                    A--;
                } else {
                    res.append('b');
                    B--;
                }
            }
            return res.toString();
        }
    }
}

    