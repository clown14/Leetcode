package main.leetcode.array_in_300;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-12-17 22:09
 **/

public class number1 {
    /**
     * 暴力法很简单，遍历每个元素 [公式] ，并查找是否存在一个值与 [公式] 相等的目标元素。
     */
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    res[0]=i;
                    res[1]=j;
                }
            }
        }
        return res;
    }

    /**
     * 一遍哈希表：
     * 通过以空间换取速度的方式，我们可以将查找时间从 O(n)降低到 O(1) 。
     * 哈希表正是为此目的而构建的，它支持以 近似 恒定的时间进行快速查找。我用“近似”来描述，是因为一旦出现冲突，查找用时可能会退化到 O(n) 。
     * 但只要你仔细地挑选哈希函数，在哈希表中进行查找的用时应当被摊销为 O(1) 。
     * 在进行迭代并将元素插入到表中的同时，我们还会回过头来检查表中是否已经存在当前元素所对应的目标元素。如果它存在，那我们已经找到了对应解，并立即将其返回。
     */
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

