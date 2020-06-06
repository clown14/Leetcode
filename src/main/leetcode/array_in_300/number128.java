package main.leetcode.array_in_300;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-06-06 15:45
 **/

import java.util.HashSet;
import java.util.Set;

/**
 * 这道题目最开始大家想的肯定是sort，然后计数计算最长序列。但是要求时间复杂度为：o(n)，就不能用sort了。一般在leetcode中，
 * 对时间复杂度有要求，就用空间来换，对空间复杂度有要求，就用时间来换。
 * 基于这种思路我们就想要求最长的，就是要记录下有没有相邻的元素，比如遍历到100这个元素，我们需要查看[99, 101]这两个元素在不在序列中，
 * 这样去更新最大长度。而记录元素有没有这个事我们太熟悉了，用set这种数据结构，而set这种数据结构是需要o(n)的空间来换取的，
 * 这就是我们刚才说的用空间来换时间。
 */

public class number128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (Integer num : nums) {
            numSet.add(num);
        }
        int longest = 0;
        for (Integer num : nums) {
            if (numSet.remove(num)) {
                int currentLongest = 1;
                int current = num;
                while (numSet.remove(current-1)) current--;
                currentLongest += (num - current);

                current = num;
                while (numSet.remove(current+1)) current++;
                currentLongest += (current - num);
                longest = Math.max(longest, currentLongest);
            }
        }
        return longest;
    }
}

    