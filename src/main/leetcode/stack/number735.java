package main.leetcode.stack;

import java.util.Arrays;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-10-27 21:36
 **/

/*
使用mono数组存放结果，使用idx维护残留下的小行星的坐标，默认右向行驶的小行星直接入mono,
左向行驶的小行星则先碰撞处理，然后分情况处理
 */

public class number735 {
    public int[] asteroidCollision(int[] asteroids) {
        int[] mono = new int[asteroids.length];
        int idx = 0;

        for(int aster: asteroids){
            //若未存放元素或者小行星向右行驶或者小行星向左行驶且数组中上一个小行星也是向左，那么将当前小行星放入mono
            if(idx == 0 || aster > 0 || (aster < 0 && mono[idx - 1] < 0)){
                mono[idx++] = aster;
                continue;
            }
            if(aster < 0){
                //碰撞处理
                while(idx > 0 && mono[idx - 1] > 0 && mono[idx - 1] < -aster){
                    idx--;
                }
                //mono中存储的小行星与当前小行星方向相反，且质量较大
                if(idx > 0 && mono[idx - 1] > -aster){
                    continue;
                }
                //方向相反，质量相同
                if(idx > 0 && mono[idx - 1] == -aster){
                    idx--;
                    continue;
                }
                //方向相同(都是往左)
                if(idx == 0 || mono[idx - 1] < 0){
                    mono[idx++] = aster;
                }

            }
        }
        //idx为残留小行星边界，不包含
        return Arrays.copyOfRange(mono,0,idx);
    }
}

    