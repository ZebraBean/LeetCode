package 数组.b_移除元素.ac01_lc27_220807_easy;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/8/7
 * Time: 15:36
 * Description: No Description
 */
public class my {
    public int removeElement(int[] nums, int val) {
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[len] == val){
                for (int j = len; j < nums.length-1 ; j++) {
                    nums[j] = nums[j + 1];
                }
            }else {
                len++;
            }
        }
        return len;
    }
}
