package 数组.a_二分查找.a05_lc367_有效的完全平方数_easy;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/8/3
 * Time: 10:10
 * Description: No Description
 */
public class ac_22_08_03 {
    public boolean isPerfectSquare(int num) {
        int left = 1;
        int right = num;
        long mid = 1;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                left = (int) (mid + 1);
            }else {
                right = (int) (mid - 1);
            }
        }
        return false;
    }
}
