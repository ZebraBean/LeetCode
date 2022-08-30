package Medium.Medium_03;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/3/17
 * Time: 23:10
 * Description: No Description
 */
public class my {
//    public static void main(String[] args) {
//        String s = "aa";
//        Solution solution = new Solution();
//        System.out.println(solution.lengthOfLongestSubstring(s));
//    }
}
//class Solution {
//    public int lengthOfLongestSubstring(String s) {
//        if (s.length() == 0){
//            return 0;
//        }
//        int max = 1;
//        for (int i = 0; i < s.length(); i++) {
//            int temp = 1;
//            for (int j = i+1; j < s.length(); j++) {
//                boolean flag = true;
//                for (int k = i; k < j ; k++) {
//                    if (s.charAt(j) == s.charAt(k)){
//                        i = k;
//                        flag = false;
//                        break;
//                    }
//                }
//                if (!flag){
//                    break;
//                }else {
//                    temp++;
//                }
//            }
//            if (temp > max){
//                max = temp;
//            }
//        }
//        return max;
//    }
//}