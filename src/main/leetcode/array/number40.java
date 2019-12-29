package main.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-12-29 23:11
 **/

/*
跟39-组合总和思路相似，不同点是此题同一位置元素不能一直使用，只能使用一次，并且需要给该数组排序，这样遍历的时候记录当前符合条件的元素值，
往后遍历如果该元素等于记录的当前元素值，则跳过（因为以当前元素值开头的结果都已经找过了）。
 */

public class number40 {
    int sum;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new LinkedList<>();
        helper(res, list, target, candidates, 0);
        return res;
    }

    private void helper(List<List<Integer>> res, List<Integer> list, int target, int[] candidates, int start) {
        if (sum == target) {
            res.add(new ArrayList<>(list));
            return;
        }
        int pre = 0;
        for (int i = start; i < candidates.length; i++) {
            if (sum + candidates[i] <= target) {
                if (pre == candidates[i]) {
                    continue;
                }
                list.add(candidates[i]);
                sum += candidates[i];
                pre = candidates[i];
                helper(res, list, target, candidates, i + 1);
                sum -= candidates[i];
                list.remove(list.size() - 1);
            }
        }
    }
}

    