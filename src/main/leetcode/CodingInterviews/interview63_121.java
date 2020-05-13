package main.leetcode.CodingInterviews;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-05-13 14:58
 **/

/**
 * 因为时间是不可逆的，所以不需要回头比较数据，
 * 故只需要遍历一次数组：
 * 利润 = 卖出- 买入
 * 所以 让卖出尽可能大并让买入尽可能小。
 * 最后 比较出所有利润中的最大值。
 */

public class interview63_121 {
    public int maxProfit(int[] prices) {
        int maxPrice = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int p : prices){
            minPrice = Math.min(minPrice, p);
            maxPrice = Math.max(maxPrice, p - minPrice);
        }
        return maxPrice;
    }
}

    