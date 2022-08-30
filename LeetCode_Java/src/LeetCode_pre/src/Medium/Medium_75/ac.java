package Medium.Medium_75;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/2/25
 * Time: 21:25
 * Description: No Description
 */
public class ac {
    public class Solution {

        public void sortColors(int[] nums) {
            int len = nums.length;
            if (len < 2) {
                return;
            }

            // 循环终止条件是 i > two，那么循环可以继续的条件是 i <= two

            int zero = 0;

            int two = len-1;
            int i = 0;
            
            while (i <= two) {
                if (nums[i] == 0) {
                    swap(nums, i, zero);
                    zero++;
                    i++;
                } else if (nums[i] == 1) {
                    i++;
                } else {
                    swap(nums, i, two);
                    two--;
                }
            }
        }

        private void swap(int[] nums, int index1, int index2) {
            int temp = nums[index1];
            nums[index1] = nums[index2];
            nums[index2] = temp;
        }
    }
}
