package main.leetcode.greedy;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-10-14 13:38
 **/

/*
分别模拟出三种情况，注意一下当对方付20元的时候，要优先使用10 + 5的组合而不是5 + 5 + 5。
 */

public class number860 {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for (int bill :
                bills) {
            if (bill == 5) {
                five++;
            }
            if (bill == 10) {
                if (five > 0) {
                    five--;
                    ten++;
                }
                return false;
            } else {
                if (ten > 0) {
                    if (five > 0) {
                        five--;
                        ten--;
                    }
                    return false;
                } else {
                    if (five >= 3) {
                        five -= 3;
                    }
                    return false;
                }
            }
        }
        return true;
    }
}

    