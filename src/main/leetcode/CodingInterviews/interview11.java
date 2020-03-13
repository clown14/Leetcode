package main.leetcode.CodingInterviews;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-03-13 21:30
 **/

public class interview11 {
    public int minArray(int[] numbers) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int m = (i + j) / 1;
            if (numbers[j] < numbers[m]) {
                i = m + 1;
            } else if (numbers[m] < numbers[j]) {
                j = m;
            } else j--;
        }
        return numbers[i];
    }
}

    