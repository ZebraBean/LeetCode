package 数组.b_移除元素.ac05_lc977_220815_easy;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/8/16
 * Time: 11:36
 * Description: No Description
 */
public class better {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int leftIndex = -1;
        int rightIndex = 0;
        int p = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                rightIndex = i+1;
                leftIndex = i;
            }else{
                break;
                //1.如果全是正数 leftIndex == -1 && rightIndex == 0
                //2.如果全是负数 leftIndex == nums.length - 1 && rightIndex == nums.length
                //3.如果正常情况，没有问题
            }
        }

        while (leftIndex >= 0 || rightIndex < nums.length) {
            if (leftIndex < 0) {
                //全是正数（包括0）
                ans[p] = nums[rightIndex] * nums[rightIndex];
                rightIndex++;
                p++;
            } else if (rightIndex >= nums.length) {
                //全是负数
                ans[p] = nums[leftIndex] * nums[leftIndex];
                leftIndex--;
                p++;
            } else if (nums[leftIndex] * nums[leftIndex] > nums[rightIndex] * nums[rightIndex]) {
                ans[p] = nums[rightIndex] * nums[rightIndex];
                rightIndex++;
                p++;
            } else {
                ans[p] = nums[leftIndex] * nums[leftIndex];
                leftIndex--;
                p++;
            }
        }
        return ans;
    }
}
