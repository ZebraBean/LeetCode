package LeetCode.Easy_997;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2021/12/19
 * Time: 11:39
 * Description: No Description
 */
public class ac_997 {
}
//class Solution {
//    public int findJudge(int n, int[][] trust) {
//        if (n == 1){  //特判
//            return 1;
//        }
//        int[] sizeRemember = new int[n];  //相当于就是出度
//        int[] notAns = new int[n];
//        int maxSize = -1;
//        int maxPos = -1;
//        for (int i = 0; i < trust.length; i++) {
//            notAns[trust[i][0]-1] = 1;
//            sizeRemember[trust[i][1]-1]++;
//            if (maxSize < sizeRemember[trust[i][1]-1]){
//                maxSize = sizeRemember[trust[i][1]-1];
//                maxPos = trust[i][1]-1;
//            }
//        }
//        if (maxSize == n-1 && notAns[maxPos] != 1){
//            return maxPos+1;
//        }
//        return -1;
//    }
//}
class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] inDegrees = new int[n + 1];
        int[] outDegrees = new int[n + 1];
        for (int[] edge : trust) {
            int x = edge[0], y = edge[1];
            ++inDegrees[y];
            ++outDegrees[x];
        }
        for (int i = 1; i <= n; ++i) {
            if (inDegrees[i] == n - 1 && outDegrees[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}