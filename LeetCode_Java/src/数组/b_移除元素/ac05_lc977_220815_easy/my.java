package 数组.b_移除元素.ac05_lc977_220815_easy;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/8/15
 * Time: 22:05
 * Description: No Description
 */
public class my {
//    public int[] sortedSquares(int[] nums) {
//        int[] ans = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            ans[i] = nums[i] * nums[i];
//        }
//        Arrays.sort(ans);
//        return ans;
//    }

    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int leftIndex = -1;
        int rightIndex = -1;
        int p = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                rightIndex = i;
                leftIndex = i-1;
                break;
            }
        }
        //找到0附近
        //正常情况
        while (leftIndex >= 0 && rightIndex >= 0 && rightIndex < nums.length) {
            if (nums[leftIndex] * nums[leftIndex] > nums[rightIndex] * nums[rightIndex]) {
                ans[p] = nums[rightIndex] * nums[rightIndex];
                rightIndex++;
            } else {
                ans[p] = nums[leftIndex] * nums[leftIndex];
                leftIndex--;
            }
            p++;
        }
        //退出后，要不就是1.leftIndex<0,要不就是2.rightIndex >nums.length
        //还有两种情况，没有进入前面的while循环，
        // 3.leftIndex == -1 && rightIndex == -1;
        // 4.leftIndex == -1 && rightIndex == 0  //可以合并掉
        if (leftIndex == -1 && rightIndex == -1) {
            //全是负数
            leftIndex = nums.length - 1;
            rightIndex = nums.length;
        }
        if (leftIndex < 0) {
            //没有负数了
            while (rightIndex < nums.length) {
                ans[p] = nums[rightIndex] * nums[rightIndex];
                rightIndex++;
                p++;
            }
        } else if (rightIndex >= nums.length) {
            //全是负数
            while (leftIndex >= 0) {
                ans[p] = nums[leftIndex] * nums[leftIndex];
                leftIndex--;
                p++;
            }
        }
        return ans;
    }
}
