package 数组.b_移除元素.ac02_lc26_220811_easy;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/8/11
 * Time: 16:01
 * Description: No Description
 */
public class my {
    public int removeDuplicates(int[] nums) {
        int slowIndex = 0;
        int fastIndex;
        for (fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != nums[slowIndex]) {
                slowIndex++;
                nums[slowIndex] = nums[fastIndex];
            }
        }
        return slowIndex + 1;
    }
}
