package main.leetcode.stack;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-11-08 11:33
 **/

public class number1003 {
    public boolean isValid(String S) {
        if (S.length() % 3 != 0)
            return false;

        while (S.contains("abc"))
            S = S.replace("abc", "");
        return S.length() == 0;
    }
}

    