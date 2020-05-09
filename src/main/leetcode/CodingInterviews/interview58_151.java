package main.leetcode.CodingInterviews;

import java.util.Arrays;
import java.util.Collections;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-05-09 15:09
 **/


public class interview58_151 {
    public String reverseWords(String s) {
        String[] words = s.trim().split(" +");
        //逆置
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }
}

    