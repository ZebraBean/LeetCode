package 数组.d_螺旋矩阵.ac02_jz29_220831_顺时针打印指针;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/8/31
 * Time: 19:29
 * Description: No Description
 */
public class my {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        int left = 0;
        int right = colLen - 1;
        int up = 0;
        int down = rowLen - 1;
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;

        while (i < rowLen * colLen){
            for (int j = left; j <= right ; j++) {
                ans.add(matrix[up][j]);
                i++;
            }
            up++;
            if (up > down)
                break;
            for (int j = up; j <= down ; j++) {
                ans.add(matrix[j][right]);
                i++;
            }
            right--;
            if (left > right)
                break;
            for (int j = right; j >= left ; j--) {
                ans.add(matrix[down][j]);
                i++;
            }
            down--;
            if (up > down)
                break;
            for (int j = down; j >= up ; j--) {
                ans.add(matrix[j][left]);
                i++;
            }
            left++;
            if (left > right)
                break;
        }
        return ans;
    }
}
