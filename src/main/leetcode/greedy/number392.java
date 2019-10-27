package main.leetcode.greedy;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-10-18 12:50
 **/

/*
本文主要运用的是双指针的思想，指针si指向s字符串的首部，指针ti指向t字符串的首部。
比较s[si]和t[ti]，如果s[si] === t[ti], 我们将si和ti都加一，比较字符串中的下一个字符。如果s[si] !== t[ti],
我们只需跳过（删除）当前t[ti]的字符串，往下查找。
最好，如果s字符串中包含完整的t序列，那么si必然等于s字符串的长度，我们由此可以判断s字符串中是否了包含完整的t序列。
 */

public class number392 {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        if (i == s.length() - 1) {
            return true;
        } else {
            return false;
        }
    }
}

    