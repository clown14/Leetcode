package main.leetcode.CodingInterviews;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-03-07 17:18
 **/

/**
 * 用另外一个初始为空的字符串来存储结果，遍历一遍字符串，每遇到非空格就直接在末尾加上该字符，如果为空则替换加到末尾。
 * StringBuilder是可变类，线性不安全的，不支持并发操作，不适合多线程中使用，但其在单线程中的性能比StringBuffer高。
 */

public class interview05 {
    public String replaceSpace(String s) {
        StringBuilder sb=new StringBuilder();
        for(char c : s.toCharArray()){
            if(c==' '){
                sb.append("%20");
            }else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

    