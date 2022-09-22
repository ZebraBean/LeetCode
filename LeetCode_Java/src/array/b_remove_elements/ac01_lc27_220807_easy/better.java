package 数组.b_移除元素.ac01_lc27_220807_easy;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/8/8
 * Time: 9:37
 * Description: No Description
 */
public class better {
    public int removeElement(int[] nums, int val) {
        //双指针法
        int slowIndex = 0;
        int fastIndex = 0;
        for (fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != val) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }
    public int removeElement2(int[] nums, int val) {
    //双向指针法
        int slowIndex = 0;
        int fastIndex = nums.length - 1;
        while (slowIndex <= fastIndex) {
            while (slowIndex <= fastIndex && nums[slowIndex] != val) {
                slowIndex++;
            }
            while (slowIndex <= fastIndex && nums[fastIndex] == val) {
                fastIndex--;
            }
            //此时slowIndex可能已经>=fastIndex了，所以需要加上判断条件
            if (slowIndex < fastIndex) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
                fastIndex--;
            }
        }
        return slowIndex;
    }
}
