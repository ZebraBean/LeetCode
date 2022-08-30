package 数组.a_二分查找.a04_lc69x的平方根_easy;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/3/31
 * Time: 21:41
 * Description: No Description
 */
public class my {
    public int mySqrt(int x) {
        int left = 1;
        int right = x;
        int leftboard = 0;
        while(left <= right){
            int mid = left+((right-left)>>1);
            if ((long)mid*mid > x){
                right = mid - 1;
                leftboard = mid-1;
            }else if ((long)mid*mid < x){
                left = mid + 1;
            }else {
                return mid;
            }
        }
        return leftboard;
    }
}