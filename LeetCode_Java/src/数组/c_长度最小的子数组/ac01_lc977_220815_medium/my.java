package 数组.c_长度最小的子数组.ac01_lc977_220815_medium;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/8/20
 * Time: 11:25
 * Description: No Description
 */
public class my {
    public static int minSubArrayLen(int target, int[] nums) {
        int leftIndex = 0;
        int rightIndex = 0;
        int sum = 0;
        int sumCount = 0;
        int minAns = Integer.MAX_VALUE;
        while(rightIndex < nums.length || sum >= target){
            if (sum < target && rightIndex < nums.length) {
                sum += nums[rightIndex];
                sumCount++;
                rightIndex++;
            }else {
                while (sum >= target) {
                    if (sumCount < minAns) {
                        minAns = sumCount;
                    }
                    sum -= nums[leftIndex];
                    sumCount--;
                    leftIndex++;
                }
            }
        }
        if (Integer.MAX_VALUE == minAns) {
            minAns = 0;
        }
        return minAns;
    }
}
