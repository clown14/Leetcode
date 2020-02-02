package main.leetcode.DP;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-02-02 15:47
 **/

/*
对于每一个房子有两种选择，偷还是不偷：
1.偷：偷的话将当前房子的钱+上一个房子没偷钱的时候钱的最大值（因为不能偷两个连续的房屋）
2.不偷：不偷的话，则取上一个房子偷钱的情况和上一个房子没偷钱的情况的最大值
这样遍历完后，取他们俩的最大值即为答案。
 */

public class number198 {
    public int rob(int[] nums) {
        int rob = 0, noRob = 0;
        for (int money : nums) {
            int temp = noRob + money;
            noRob = Math.max(rob, noRob);
            rob = temp;
        }
        return Math.max(rob, noRob);
    }
}

    