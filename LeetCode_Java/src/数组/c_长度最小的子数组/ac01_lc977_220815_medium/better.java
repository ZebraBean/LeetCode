package 数组.c_长度最小的子数组.ac01_lc977_220815_medium;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/8/20
 * Time: 13:03
 * Description: No Description
 */
public class better {
    public static int minSubArrayLen(int target, int[] nums) {
        int leftIndex = 0;
        int rightIndex = 0;
        int sum = 0;
        int windowLen = 0;
        int minAns = Integer.MAX_VALUE;
        while(rightIndex < nums.length){
            sum += nums[rightIndex];
            while (sum >= target) {
                windowLen = rightIndex-leftIndex+1;
                if (windowLen < minAns) {
                    minAns = windowLen;
                }
                sum -= nums[leftIndex];
                leftIndex++;
            }
            rightIndex++;
        }
        if (Integer.MAX_VALUE == minAns) {
            minAns = 0;
        }
        return minAns;
    }
}
