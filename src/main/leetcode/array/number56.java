package main.leetcode.array;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-12-31 15:09
 **/

/*
首先将区间按区间开始的大小排序（由小到大）
然后拿到第一个最小的作为开始区间，从第二个区间开始遍历：
拿到当前遍历的区间的开始位置和开始区间的结束位置作比较：
若开始区间的end > 结束区间的start并且开始区间的end小于结束区间的end，则将两个区间合并，
反之，则将开始区间添加到结果集合中并将当前区间重新设置为开始区间。
遍历结束后，再将最后的开始区间添加到结果集合中。
 */

public class number56 {
    private static class Interval {
        int start;
        int end;
        Interval(int[] interval) {
            this.start = interval[0];
            this.end = interval[1];
        }

        int[] toArray() {
            return new int[]{this.start, this.end};
        }
    }

    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> res = new LinkedList<>();
        if (intervals.size() > 0) {
            sort(intervals);
            Interval start = intervals.get(0);
            for (int i = 1; i < intervals.size(); i++) {
                Interval temp = intervals.get(i);
                if (start.end < temp.start) {
                    res.add(start);
                    start = temp;
                } else {
                    if (start.end < temp.end)
                        start.end = temp.end;
                }
            }
            res.add(start);
        }
        return res;
    }

    private void sort(List<Interval> intervals) {

        Collections.sort(intervals, new Comparator<Interval>() {

            @Override
            public int compare(Interval o1, Interval o2) {

                return o1.start < o2.start ? -1 : (o1.start == o2.start ? 0 : 1);
            }
        });
    }
}

    