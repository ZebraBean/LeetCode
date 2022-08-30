package LeetCode.Easy_35;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2021/11/20
 * Time: 21:42
 * Description: No Description
 */
public class ac_35 {
}
class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        int mid = 0;
        int pos = 0;
        while (i <= j){   //二分查找
            mid = (i + j)/2;
            if(target < nums[mid]){
                j = mid-1;
            }else if(target > nums[mid]){
                i = mid+1;
            }else {
                return mid;  //找到了直接返回下标即可
            }
        }
        if (target < nums[mid]){  //走到这里说明没有找到target,如果没找到，最后一次和target比较的元素下标是mid
            return mid;  //如果target比当前点(mid)的值要小的话，当前值后移，target插在这里
        }else {
            return mid +1;  //如果target比当前点(mid)的值要大的话，target插在当前值的后一个位置
        }
    }
}