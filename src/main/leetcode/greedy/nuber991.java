package main.leetcode.greedy;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-10-12 22:12
 **/

public class nuber991 {
    class Solution {
        public int brokenCalc(int X, int Y) {
            int count=0;
            while (X != Y) {
                if (X > Y) {
                    count = X - Y;
                    break;
                } else if (Y % 2 == 0) {
                    Y /= 2;
                    count++;
                } else {
                    Y = (Y + 1) / 2;
                    count += 2;
                }
            }
            return count;
        }
    }
}

    