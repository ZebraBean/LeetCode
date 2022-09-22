package 数组.a_二分查找.a05_lc367_有效的完全平方数_easy;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/4/1
 * Time: 21:50
 * Description: No Description
 */
public class my {
}
class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 1;
        int right = num;
        while(left <= right){
            int mid = left+((right-left)>>1);
            if ((long)mid*mid == num){
                return true;
            }else if ((long)mid*mid > num){
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return false;
    }
}