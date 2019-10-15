package main.leetcode.greedy;

import java.util.Arrays;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-10-15 20:47
 **/

public class number881 {
    class Solution {
        public int numRescueBoats(int[] people, int limit) {
            Arrays.sort(people);
            int left = 0, right = people.length - 1;
            int res = 0;
            while (left <= right) {
                res++;
                if ((people[left] + people[right]) <= limit) {
                    left++;
                }
                right--;
            }
            return res;
        }
    }
}

    