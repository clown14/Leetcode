package main.leetcode.sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-02-07 21:08
 **/

/*
首先将列表里的字符串按长度由大到小排序，若长度相等，则按两个字符串字母字典顺序排序。
这样从排序后的列表的第一个元素开始判断，判断的方法利用指针，若字符匹配，则指针后移，
最后判断指针移动的次数是否和当前遍历字符串元素的长度相等，若相等，则为正确答案（第一个匹配的字符串一定是最长且字典顺序最小的）。
 */

public class number524 {
    public String findLongestWord(String s, List<String> d) {
        Collections.sort(d,new Comparator<String>(){
            public int compare(String o1, String o2){
                return o1.length()!=o2.length() ? o2.length()-o1.length() : o1.compareTo(o2);
            }
        });
        for(String str : d){
            if(isRes(s, str)){
                return str;
            }
        }
        return "";
    }

    public boolean isRes(String s, String elem){
        if(s.length() < elem.length()){
            return false;
        }
        int i=0;
        for(int j=0; j<s.length() && i<elem.length(); j++){
            if(s.charAt(j)==elem.charAt(i)){
                i++;
            }
        }
        return i==elem.length();
    }
}

    