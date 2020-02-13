package main.leetcode.sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2020-02-13 19:20
 **/

/*
将所有坐标存放好后重写排序规则即可
 */

public class number1030 {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] res= new int[R*C][2];
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                res[i*C+j]=new int[]{i,j};
            }
        }
        Arrays.sort(res, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return Math.abs(a[0]-r0)+Math.abs(a[1]-c0)-(Math.abs(b[0]-r0)+Math.abs(b[1]-c0));
            }
        });
        return res;
    }
}

    