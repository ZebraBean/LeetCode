package 数组.d_螺旋矩阵.ac01_lc59_220830_medium;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/8/30
 * Time: 20:31
 * Description: No Description
 */
public class zTest {
    public static void main(String[] args) {
        int n = 3;
        int[][] a = generateMatrix(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static int[][] generateMatrix(int n) {
        int x = 0;
        int y = 0;
        int flag = 1;
        int[][] ans = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = Integer.MAX_VALUE;
            }
        }
        for (int i = 1; i <= n * n; i++) {
            ans[x][y] = i;
            if (flag == 1) {
                if (y + 1 < n && ans[x][y + 1] > i) {
                    y += 1;
                } else {
                    flag = 2;
                }
            }
            if (flag == 2) {
                if (x + 1 < n && ans[x + 1][y] > i) {
                    x += 1;
                } else {
                    flag = 3;
                }
            }
            if (flag == 3) {
                if (y - 1 >= 0 && ans[x][y - 1] > i) {
                    y -= 1;
                } else {
                    flag = 4;
                }
            }
            if (flag == 4) {
                if (x - 1 >= 0 && ans[x - 1][y] > i) {
                    x -= 1;
                } else {
                    flag = 1;
                    y++;
                }
            }
        }
        return ans;
    }
}
