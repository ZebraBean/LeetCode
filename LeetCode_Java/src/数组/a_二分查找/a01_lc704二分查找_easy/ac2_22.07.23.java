package 数组.a_二分查找.a01_lc704二分查找_easy;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/3/27
 * Time: 21:40
 * Description: No Description
 */
class Solution2 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while (left <= right){
            int mid = left+(right-left)>>1;
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return -1;
    }
}