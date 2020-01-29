package main.leetcode.sort;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-01-29 15:21
 **/

/*
用双指针的思想，维护左右指针分别指向数组首尾，对数组从左向右进行遍历：
若遇到0，则与左指针指向元素交换，并将左指针右移一位
若遇到2，则与右指针指向元素交换，并将右指针左移一位，因为交换过来的元素仍可能为2，所以再次对此元素进行判断
 */

public class number75 {
    public void sortColors(int[] nums) {
        int right = nums.length - 1, left = 0;
        for(int i = 0; i <= right; i++){
            if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[left];
                nums[left++] =temp;
            }

            else if(nums[i] == 2){
                int temp = nums[i];
                nums[i] = nums[right];
                nums[right--] =temp;
                i--;
            }
        }
    }
}

    