package main.leetcode.sort;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-02-06 19:27
 **/

/*
申明两个hashset，set1和set2，用于存放不重复的数组。
将两个数组中的任意一个（例如num2）放入set1中，然后在和另一个数组（例如num1）进行比较，找出重复的，然后放入set2中，此时的set2就是我们需要的交集数组
 */
public class number349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int x : nums1) {
            set1.add(x);
        }
        for (int x : nums2) {
            if (set1.contains(x)) {
                set2.add(x);
            }
        }
        int[] res = new int[set2.size()];
        Iterator iterator = set2.iterator();

        for (int i = 0; i < set2.size(); i++) {
            res[i] = (int) iterator.next();
        }
        return res;
    }
}

    