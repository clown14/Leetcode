package main.leetcode.greedy;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-10-07 15:06
 **/

/*
采用贪心算法，用一个 reach 变量 记录能够到达的最远的下标，每走一步比较更新该值，到达最终位置前，如果当前下标大于reach，说明失败。
如果能到达最后，说明成功。
这样一个局部的最优贪心策略，在全局看来也是最优的，因为 局部能够到达的最大范围也是全局能够到达的最大范围：
 */

public class number55 {
    class Solution {
        public boolean canJump(int[] nums) {
            if (nums == null || nums.length == 0) {
                return false;
            }
            int reach = 0;
            for (int i = 0; i < nums.length; i++) {
                if (i > reach) {
                    return false;
                }
                if (i + nums[i] < reach) {
                    reach = i + nums[i];
                }
            }
            return true;
        }
    }
}

    