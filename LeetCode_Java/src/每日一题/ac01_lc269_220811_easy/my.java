package 每日一题.ac01_lc269_220811_easy;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/8/11
 * Time: 17:54
 * Description: No Description
 */
public class my {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i <= n; i++) {
            sum += nums[i];
        }
        return n * (n + 1) / 2 - sum;
    }
}
