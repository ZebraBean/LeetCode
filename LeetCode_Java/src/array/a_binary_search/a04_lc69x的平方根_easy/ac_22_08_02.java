package 数组.a_二分查找.a04_lc69x的平方根_easy;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/8/2
 * Time: 17:37
 * Description: No Description
 */
public class ac_22_08_02 {
//    public int mySqrt(int x) {
//        long left = 0;
//        long right = x;
//        long mid = 0;
//        while (left <= right) {
//            mid = left + ((right - left) >> 1);
//            if (mid * mid == x) {
//                return (int)mid;
//            } else if (mid * mid < x) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//        if (mid * mid < x) {
//            return (int)mid;
//        } else {
//            return (int) (mid - 1);
//        }
//    }
    public int mySqrt(int x) {
        long left = 0;
        long right = x;
        long mid = 0;
        long leftboard = 0;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (mid * mid == x) {
                leftboard = mid;
                break;
            } else if (mid * mid < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
                leftboard = mid - 1;
            }
        }
        return (int)leftboard;
    }
}
