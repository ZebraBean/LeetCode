package LeetCode.Easy_26;

public class wa_26 {
}
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null){
            return 0;
        }
        int slow = 0;  //实际上表示的是新数组的下标,也可以改为newpos
        int fast = 1;  //实际上表示当前访问的值，也可以改为cur
        while (fast < nums.length){
            if (nums[slow] == nums[fast]){
                fast++;
            }else {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow+1;
    }
}