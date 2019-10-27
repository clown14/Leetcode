package main.leetcode.greedy;

import java.util.Arrays;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-10-15 20:47
 **/

/*
我们用到的方法是双指针贪心算法。

如果最重的人可以与最轻的人共用一艘船，那么就这样做。否则，最重的人不能与任何人配对，所以他们得到自己的船。

这样做的原因是因为如果最轻的人可以与任何人配对，他们也可以与最重的人配对。让p[i]到目前最轻的人，让p[j]到最重的人。

然后，如上所述，如果最重的人可以与最轻的人共享船（如果p[j] +p[i] <=限制），那么这样做;否则，最重的人坐在自己的船上。
 */

public class number881 {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0, right = people.length - 1;
        int res = 0;
        while (left <= right) {
            res++;
            if ((people[left] + people[right]) <= limit) {
                left++;
            }
            right--;
        }
        return res;
    }
}

    