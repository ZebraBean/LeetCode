package 数组.a_二分查找.a02_lc35搜索插入位置_easy;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/3/28
 * Time: 20:55
 * Description: No Description
 */
public class better {
}
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid = -1;
        while (left <= right){
            mid = left + ((right-left)>>1);
            if (nums[mid] == target){
                return mid;
            }else if (nums[mid] < target){
                left = mid + 1 ;
            }else {
                right = mid - 1;
            }
        }
        return right+1;
    }
}