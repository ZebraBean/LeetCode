package 数组.a_二分查找.a01_lc704二分查找_easy;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/3/27
 * Time: 21:40
 * Description: No Description
 */
public class my {
}
class Solution1 {
    public int search(int[] nums, int target) {
        int ans = 0;
        int i = 0;
        int j = nums.length-1;
        while(i <= j){
            int mid = (i+j)/2;
            if (nums[mid] == target){
                return mid;
            }else if (nums[mid] < target){
                i = mid+1;
            }else {
                j = mid-1;
            }
        }
        return -1;
    }
}