package LeetCode.Easy_70;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2021/11/30
 * Time: 15:55
 * Description: No Description
 */
public class ac_70 {
}
//class Solution {  //递归，你是真的不怕超时
//    public int climbStairs(int n) {
//        if (n == 1){
//            return 1;
//        }
//        if (n == 2){
//            return 2;
//        }
//        return climbStairs(n-1)+climbStairs(n-2);
//    }
//}

class Solution {  //非递归,动态规划+滚动数组
    public int climbStairs(int n) {
        if (n == 1){
            return 1;
        }
        if (n == 2){
            return 2;
        }
        int ans = 0;
        int n_1 = 2;
        int n_2 = 1;
        int i = 1;
        while (i <= n-2){
            ans = n_1+n_2;
            n_2 = n_1;
            n_1 = ans;
            i++;
        }
        return ans;
    }
}
