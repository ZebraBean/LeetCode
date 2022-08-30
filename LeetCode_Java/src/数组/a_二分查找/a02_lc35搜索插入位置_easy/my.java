package 数组.a_二分查找.a02_lc35搜索插入位置_easy;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/3/28
 * Time: 20:33
 * Description: No Description
 */
public class my {
}
class Solution1 {
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
        if (target > nums[mid]){
            return mid+1;//此时right一定是mid，因为最后变的是left，所以mid+1就是right+1
        }else {
            return mid;//此时right一定是mid-1，因为最后变的是right，right变成mid-1了，所以mid就是right+1
        }
    }
}
