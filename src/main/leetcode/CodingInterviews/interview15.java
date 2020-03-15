package main.leetcode.CodingInterviews;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-03-15 15:04
 **/

/**
 * 将二进制数右移与1，如果结果等于1则最右位是1，右移一位继续比较
 * 存在问题：右移正负值处理不同可能会出现死循环
 * java中有三种移位运算符
 *
 * <<      :     左移运算符，num << 1,相当于num乘以2
 *
 * >>      :     右移运算符，num >> 1,相当于num除以2
 *
 * >>>    :     无符号右移，忽略符号位，空位都以0补齐
 * 本方法左右移，效率高于乘除
 * 可以使用无符号右移解决死循环问题
 */

public class interview15 {
    public int numberOf1_1(int n) {
        int count = 0;
        while (n !=0){
            if ((n & 1) == 1){
                count++;

            }
            n = n >>> 1;
        }
        return count;
    }
}

    