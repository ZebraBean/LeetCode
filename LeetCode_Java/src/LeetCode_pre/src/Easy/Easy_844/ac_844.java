package LeetCode.Easy_844;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2021/12/24
 * Time: 16:10
 * Description: No Description
 */
public class ac_844 {
}
//class Solution {
//    public boolean backspaceCompare(String s, String t) {
//        Stack<Character> stack1 = new Stack<>();
//        Stack<Character> stack2 = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '#'){
//                if (!stack1.isEmpty()){
//                    stack1.pop();
//                }
//            }else {
//                stack1.push(s.charAt(i));
//            }
//        }
//        for (int i = 0; i < t.length(); i++) {
//            if (t.charAt(i) == '#'){
//                if (!stack2.isEmpty()){
//                    stack2.pop();
//                }
//            }else {
//                stack2.push(t.charAt(i));
//            }
//        }
//        while(!stack1.isEmpty() && !stack2.isEmpty()){
//            if (stack1.peek().equals(stack2.peek())){
//                stack1.pop();
//                stack2.pop();
//            }else {
//                return false;
//            }
//        }
//        if (!stack1.isEmpty() || !stack2.isEmpty()){
//            return false;
//        }
//        return true;
//    }
//}


class Solution {
    public boolean backspaceCompare(String S, String T) {
        int i = S.length() - 1, j = T.length() - 1;
        int skipS = 0, skipT = 0;

        while (i >= 0 || j >= 0) {
            while (i >= 0) {
                if (S.charAt(i) == '#') {
                    skipS++;
                    i--;
                } else if (skipS > 0) {
                    skipS--;
                    i--;
                } else {
                    break;  //不是#，而且skips也用完了，那就是正常字母，退出循环留着比较
                }
            }
            while (j >= 0) {
                if (T.charAt(j) == '#') {
                    skipT++;
                    j--;
                } else if (skipT > 0) {
                    skipT--;
                    j--;
                } else {
                    break;
                }
            }
            if (i >= 0 && j >= 0) {  //如果都大于0，两个都是正常字母，比较即可，不等直接false
                if (S.charAt(i) != T.charAt(j)) {
                    return false;
                }
            } else {
                if (i >= 0 || j >= 0) {  //如果一个大于0，那就直接false
                    return false;
                }
            }
            i--;
            j--;
        }
        return true;  //完全相等，或者都为空，最后i和j是都会<0的，退出循环就是true
    }
}