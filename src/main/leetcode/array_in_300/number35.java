package main.leetcode.array_in_300;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-12-24 14:48
 **/

/*
先用二分查找找到目标值，以这个位置为基准，向左寻找第一个目标值的位置，向右寻找最后一个目标值的位置
 */

public class number35 {
    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int[] res = {-1, -1};
        while (left <= right) {
            int mid = left + (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid;
                right = mid;
                while (left > 0 && nums[left] == target) {
                    left--;
                }
                res[0] = left + 1;
                while (right < nums.length && nums[right] == target) {
                    right++;
                }
                res[1] = right - 1;
                break;
            }
        }
        return res;
    }
}


    