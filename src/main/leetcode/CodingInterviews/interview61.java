package main.leetcode.CodingInterviews;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-05-11 16:34
 **/

public class interview61 {
    public boolean isStraight(int[] nums) {
        Set<Integer> repeat=new HashSet<>();
        int max=0,min=14;
        for(int num:nums){
            if(num==0)  continue;
            max=Math.max(num,max);
            min=Math.min(num,min);
            if(repeat.contains(num))    return false;
            repeat.add(num);
        }
        return max-min<5;
    }
}

    