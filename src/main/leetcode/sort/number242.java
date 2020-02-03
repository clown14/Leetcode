package main.leetcode.sort;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-02-03 15:17
 **/

/*
这道题先判断s和t的长度，不相等则不可能是字母异或位词。
然后初始化一个int数组记录二十六个字母出现的次数。
遍历s、t，字母在s中出现一次数组对应位置上的数加1，在t中出现一次数组对应位置上的数减去1。
最后数组所有位置元素都为0返回true，即t 是 s 的字母异位词，否则返回false，t 不是 s 的字母异位词。
 */

public class number242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] result = new int[26];
        for (int i = 0; i < s.length(); i++) {
            result[s.charAt(i) - 'a']++;
            result[t.charAt(i) - 'a']--;
        }
        for (int count = 0; count < 26; count++)
            if (result[count] != 0)
                return false;
        return true;
    }
}

    