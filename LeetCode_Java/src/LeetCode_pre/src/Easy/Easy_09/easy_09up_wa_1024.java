package LeetCode.Easy_09;
//不将整数转换成字符串
public class easy_09up_wa_1024 {
    public static void main(String[] args) {

    }
    class Solution {
        public boolean isPalindrome(int x) {
            if (x < 0){
                return false;
            }
            int temp = x;
            long ans = 0;
            while(temp != 0){
                ans = ans * 10 +temp%10;
                temp /= 10;
            }
            if(ans == x){
                return true;
            }
            return false;
        }
    }
//    class Solution {
//        public boolean isPalindrome(int x) {
//            if(x<0 || x%10 == 0 && x != 0){  //这里注意对除了0以外的最后一位数为0的数进行特殊判断
//                return false;
//            }
//            int front = x;
//            int back = 0;
//            while (back < front){
//                //由于整个过程我们不断将原始数字除以 10，然后给反转后的数字乘上 10，
//                // 所以，当原始数字小于或等于反转后的数字时，就意味着我们已经处理了一半位数的数字了。
//                back = back * 10 + front%10;
//                front /= 10;
//            }
//            if (front == back || back/10 == front){
//                return true;
//            }
//            return false;
//        }
//    }
}
