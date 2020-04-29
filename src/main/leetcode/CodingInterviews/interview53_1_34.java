package main.leetcode.CodingInterviews;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-04-29 13:57
 **/

/**
 *先用二分查找找到目标值，以这个位置为基准，向左寻找第一个目标值的位置，向右寻找最后一个目标值的位置
 */

public class interview53_1_34 {
    public int search(int[] nums, int target) {
        int left=0, right=nums.length-1;
        int res=0;
        while(left<=right){
            int mid=left + (right-left)/2;
            if( nums[mid]>target){
                right=mid-1;
            }else if( nums[mid]<target){
                left=mid+1;
            }else if(nums[mid]==target){
                left=mid;
                right=mid;
                while(left>=0 && nums[left]==target){
                    left--;
                    res++;
                }
                //res[0]=left+1;
                while(right<nums.length && nums[right]==target){
                    right++;
                    res++;
                }
                res--;
                //res[1]=right-1;
                break;
            }else{
                res=0;
            }
        }
        return res;
    }
}

    