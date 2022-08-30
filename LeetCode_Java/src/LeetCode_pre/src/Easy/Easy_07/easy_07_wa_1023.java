package LeetCode.Easy_07;

public class easy_07_wa_1023 {
    public static void main(String[] args) {

    }
}
class Solution {  //better ways
    public int reverse(int x) {
        int temp = x;
        long ans = 0;
        while (temp != 0) {
            ans = ans * 10 + temp % 10;
            temp /= 10;
        }
        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
            return 0;
        } else {
            return (int) ans;
        }
    }
}

//class Solution {
//    public int reverse(int x) {
//        int temp = x;
//        int len = 0;
//        long ans = 0;
//        while (temp != 0){
//            temp /= 10;
//            len++;
//        }
//        temp = x;
//        while(len != 0) {
//            if (len == 1) {    //如果只剩最后一位数，直接加temp
//                ans += temp % 10;
//                len--;
//            } else {   //
//                ans += (temp % 10) * Math.pow(10,len-1);
//                temp /= 10;
//                len--;
//            }
//        }
//        if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE){
//            return 0;
//        }else {
//            return (int) ans;
//        }
//    }
//}