package main.leetcode.CodingInterviews;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-03-24 13:10
 **/

/**
 * 考虑定义双指针 i, j 分列数组左右两端； i 从左向右寻找偶数， j 从右向左寻找奇数，并将 偶数 nums[i] 和 奇数 nums[j] 交换。
 * 经过搜索与交换，可始终保证： 指针 i 左边都是奇数，指针 j 右边都是偶数 。循环直至 i == j 时返回，则所有奇数在所有偶数的左边。
 */

public class interview21 {
    public int[] exchange(int[] nums) {
        int i = 0, j = nums.length - 1, tmp;
        while (i < j) {
            while (i < j && (nums[i] & 1) == 1) {
                i++;
            }
            while (i < j && (nums[j] & 1) == 0) {
                j--;
            }
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        return nums;
    }
}

    