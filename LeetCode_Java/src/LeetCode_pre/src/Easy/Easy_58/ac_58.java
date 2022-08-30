package LeetCode.Easy_58;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2021/11/25
 * Time: 21:20
 * Description: No Description
 */
public class ac_58 {
}
//class Solution {  //正向遍历
//    public int lengthOfLastWord(String s) {
//        int ans = 0;
//        int curLetterLen= 0;  //存放当前单词的长度
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == ' '){  //遇到空格就将当前单词长度置0
//                curLetterLen = 0;
//            }else {
//                curLetterLen++;
//                ans = curLetterLen;
//            }
//        }
//        return ans;
//    }
//}
class Solution {  //反向遍历
    public int lengthOfLastWord(String s) {
        int ans = 0;
        int i = s.length()-1;
        while (s.charAt(i) == ' ') {
            i--;
        }
        while (i >= 0 && s.charAt(i) != ' '){
            i--;
            ans++;
        }
        return ans;
    }
}