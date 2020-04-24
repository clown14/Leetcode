package main.leetcode.CodingInterviews;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-04-24 14:41
 **/

import java.util.HashSet;
import java.util.Set;

/**
 * 利用set来判断是否有重复字符，并且用一个变量记录起始位置，若set中出现了重复字符，则拿当前字串长度和maxLen取最大值，
 * 接着将起始位置右移至重复字符的后一个位置，并把之前的字符从set中去除。最后maxLen存的值即为最长的不重复的子串，
 * 注意最后返回条件还需要判断一次，因为可能题中所给的字串已经是不重复的了。
 */

public class interview48_3 {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int maxLen=0;
        Set<Character> set=new HashSet<>();
        for(int i=0; i<s.length(); i++){
            if(!set.add(s.charAt(i))){
                maxLen=Math.max(maxLen,set.size());
                while(s.charAt(left)!=s.charAt(i)){
                    set.remove(s.charAt(left));
                    left++;
                }
                left+=1;
            }
        }
        return Math.max(set.size(), maxLen);
    }
}

    