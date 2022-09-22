package 数组.a_二分查找.a03_lc34_在排序数组中查找元素的第一个和最后一个位置medium;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/8/1
 * Time: 22:26
 * Description: No Description
 */
public class wa2_22_08_01 {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[]{-1,-1};
        int left = 0;
        int right = nums.length - 1;
        int mid = -1;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (target == nums[mid]) {
                int temp = mid;
                while (temp >= 0 && target == nums[temp]) {
                    temp--;
                }
                ans[0] = temp + 1;
                temp = mid + 1;
                while (temp <= nums.length-1 && target == nums[temp]) {
                    temp++;
                }
                ans[1] = temp - 1;
                return ans;
            } else if (target > nums[mid]) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
