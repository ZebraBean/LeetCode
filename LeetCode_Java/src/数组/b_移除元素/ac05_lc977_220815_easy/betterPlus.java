package 数组.b_移除元素.ac05_lc977_220815_easy;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/8/16
 * Time: 13:12
 * Description: No Description
 */
public class betterPlus {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        int p = nums.length - 1;
        while (leftIndex <= rightIndex) {
            if (nums[leftIndex] * nums[leftIndex] > nums[rightIndex] * nums[rightIndex]) {
                ans[p] = nums[leftIndex] * nums[leftIndex];
                leftIndex++;
                p++;
            }else {
                ans[p] = nums[rightIndex] * nums[rightIndex];
                rightIndex--;
                p++;
            }
        }
        return ans;
    }
}
