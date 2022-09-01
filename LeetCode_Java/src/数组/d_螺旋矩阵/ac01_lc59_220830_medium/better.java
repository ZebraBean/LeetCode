package 数组.d_螺旋矩阵.ac01_lc59_220830_medium;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/8/30
 * Time: 22:08
 * Description: No Description
 */
public class better {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int up = 0, down = n - 1, left = 0, right = n - 1, index = 1;
        while(index <= n * n){
            for(int i = left; i <= right; i++){
                res[up][i] = index++;
            }
            up++;
            for(int i = up; i <= down; i++){
                res[i][right] = index++;
            }
            right--;
            for(int i = right; i >= left; i--){
                res[down][i] = index++;
            }
            down--;
            for(int i = down; i >= up; i--){
                res[i][left] = index++;
            }
            left++;
        }
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.incrementAndGet();
        return res;
    }
}
