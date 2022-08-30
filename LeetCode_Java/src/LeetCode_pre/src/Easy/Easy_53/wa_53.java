package LeetCode.Easy_53;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2021/11/24
 * Time: 20:51
 * Description:
 */
public class wa_53 {
}
//class Solution {   //贪心算法
//    public int maxSubArray(int[] nums) {
//        int preSum = 0;  //保存之前和
//        int maxSum = Integer.MIN_VALUE;  //保存最大和，也就是ans
//        int curSum = 0;  //保存现在和
//        for (int i = 0; i < nums.length; i++) {
//            preSum = curSum;  //更新preSum,上一轮循环的现在和就是这轮循环的之前和
//            if (preSum < 0) {  //如果之前和<0，直接丢弃，这里置为0，这样下面更新现在和的时候相当于就是num[i]这一个数了，也就是丢弃了
//                preSum = 0;
//            }
//            curSum = preSum + nums[i];  //更新现在和，如果之前和为0，相当于被丢弃，现在和就是nums[i]这个数
//            if (curSum > maxSum) {  //如果当前和比最大和大，那就更新最大和
//                maxSum = curSum;
//            }
//        }
//        return maxSum;
//    }
//}
//class Solution {  //动态规划
//    public int maxSubArray(int[] nums) {
//        int[] f = new int[nums.length];
//        f[0] = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            f[i] = Math.max(f[i-1]+nums[i],nums[i]);
//        }
//        int ans = f[0];
//        for (int i = 0; i < f.length; i++) {
//            if (f[i] > ans){
//                ans = f[i];
//            }
//        }
//        return ans;
//    }
//}
class Solution {  //动态规划优化
    public int maxSubArray(int[] nums) {
        int pre = 0;  //一开始pre要置为0，这样它一开始加上一个数才会等于这个数
        int maxAns = nums[0];
        for (int i = 0; i < nums.length; i++) {
            pre = Math.max(pre+nums[i],nums[i]);  //这里就相当于上面的状态转换方程f[i] = Math.max(f[i-1]+nums[i],nums[i]);
            maxAns = Math.max(pre,maxAns);  //在一遍遍历的过程中不断遍历即可
        }
        return maxAns;
    }
}
