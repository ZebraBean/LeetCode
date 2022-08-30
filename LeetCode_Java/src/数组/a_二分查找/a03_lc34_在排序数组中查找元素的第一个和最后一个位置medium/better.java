package 数组.a_二分查找.a03_lc34_在排序数组中查找元素的第一个和最后一个位置medium;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/3/30
 * Time: 21:22
 * Description: No Description
 */
public class better {
}
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = getLeftBoard(nums,target);  //找左边界，就是找比target小的最右边的那个位置
        int end = getRightBoard(nums,target);//找右边界，就是找比target大的最左边的那个位置
        if (start == -2 || end == -2){  //只要有一个边界没找到，就无结果
            return new int[]{-1,-1};
        }
        if (end-start > 1){
            return new int[]{start+1 ,end-1};
        }else{
            return new int[]{-1,-1};
        }
    }

    private int getRightBoard(int[] nums, int target) {
        int end = -2;
        int left = 0;
        int right = nums.length-1;
        while (left <= right){
            int mid = left+((right-left)>>1);
            if (target < nums[mid]){
                right = mid-1;
            }else {
                left = mid+1;  //找右边界，等于的情况左边界划到当前元素右边
                end = mid+1;  //此时target如果存在，那么一定是在mid的右边，
                // 所以比target大的数里面最小的那个数，也就是我们的右边界，也一定在mid的右边，至少mid+1的位置
            }
        }
        return end;
    }

    private int getLeftBoard(int[] nums, int target) {
        int start = -2;
        int left = 0;
        int right = nums.length-1;
        while (left <= right){
            int mid = left+((right-left)>>1);
            if (target > nums[mid]){
                left = mid+1;
            }else {
                right = mid-1;
                start = mid-1;
            }
        }
        return start;
    }
}