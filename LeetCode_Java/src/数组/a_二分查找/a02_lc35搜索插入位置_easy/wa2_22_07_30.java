package 数组.a_二分查找.a02_lc35搜索插入位置_easy;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/7/30
 * Time: 19:58
 * Description: No Description
 */
public class wa2_22_07_30 {
}
class Solution2 {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid = -1;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (target < nums[mid]) {
            return mid;
        } else {
            return mid+1;
        }
    }
}