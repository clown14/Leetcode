package main.leetcode.array_in_300;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-12-27 15:36
 **/

/*
只要当前总和值小于目标值，就一直添加当前元素，添加到大于目标值，则回退到上一个状态去寻找下一个元素，
其中的start参数是为了防止出现重复答案如[2,2,3]和[3,2,2]。
 */

public class number39 {
    int sum;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new LinkedList<>();
        helper(res, list, target, candidates, 0);
        return res;
    }

    private void helper(List<List<Integer>> res, List<Integer> list, int target, int[] candidates, int start) {
        if (sum == target) {
            res.add(new LinkedList<>(list));
            return;
        }
        for (int i=start;i<candidates.length;i++) {
            if (sum + candidates[i] <= target) {
                list.add(candidates[i]);
                sum += candidates[i];
                helper(res, list, target, candidates, i);
                sum -= candidates[i];
                list.remove(list.size() - 1);
            }
        }
    }
}

    