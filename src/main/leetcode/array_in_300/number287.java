package main.leetcode.array_in_300;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-01-25 21:08
 **/

/*
思路是采用了二分法+抽屉原理。首先解释一下为什么用二分法，因为O(n2)时间复杂度不能A，所以往下应该是n*logn，很容易联想到二分法，因为其复杂度为logn。

抽屉原理是说假设你有11个苹果，要放进10个抽屉，那么至少有一个抽屉里是有两个苹果的。

对应到这题，1~n的n+1个数字，有1个数字会至少重复两次。

比如取数组为｛1，2，2，3，4，5｝，一共6个数，范围是1~5，其中位数应该是（5+1）/2 = 3，那么，如果小于等于3的数的个数如果超过了3，
那么重复的数字一定出现在[1，3]之间，否则出现在[4，5]之间。以该数组为例，中位数为3，小于等于3的数一共有4个，大于3的数有两个，所以重复的数字在[1,3]之间。
 */

public class number287 {
    public int findDuplicate(int[] nums) {
        int start = 1, end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            int count = 0;
            for (int i : nums) {
                if (i <= mid) {
                    count++;
                }
            }
            if (count <= mid) {
                start = mid + 1;
            }
            if (count > mid) {
                end = mid;
            }
        }
        return end;
    }
}

    