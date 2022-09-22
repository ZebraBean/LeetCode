package 数组.b_移除元素.ac03_lc283_220813_easy;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/8/13
 * Time: 10:26
 * Description: No Description
 */
public class my {
    public void moveZeroes(int[] nums) {
        int slowIndex = 0;
        int fastIndex = 0;
        for (; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != 0) {
                int temp = nums[slowIndex];
                nums[slowIndex] = nums[fastIndex];
                nums[fastIndex] = temp;
                slowIndex++;
            }
        }
    }
}
