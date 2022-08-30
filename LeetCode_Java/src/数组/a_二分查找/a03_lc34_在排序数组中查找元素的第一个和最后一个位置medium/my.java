package 数组.a_二分查找.a03_lc34_在排序数组中查找元素的第一个和最后一个位置medium;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/3/30
 * Time: 18:55
 * Description: No Description
 */
public class my {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        int[] ans = solution.searchRange(new int[]{5,7,7,8,8,10},8);
    }

}
class Solution1 {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int start = -1;
        int end = -1;
        while (left <= right){
            int mid = left+((right-left)>>1);
            if (nums[mid] == target){
                int i= mid-1;
                while(i >= 0 && nums[i]==target){ i--; }
                start = i+1;

                int j= mid+1;
                while(j < nums.length && nums[j] == target){ j++; }
                end = j-1;

                break;
            }else if (nums[mid] < target){
                left = mid+1;
            }else {
               right = mid-1;
            }
        }
        return new int[]{start,end};
    }
}