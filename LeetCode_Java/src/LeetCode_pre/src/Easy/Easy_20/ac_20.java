package LeetCode.Easy_20;

import java.util.Stack;

public class ac_20 {
}
class Solution {
    public boolean isValid(String s) {
        //为什么不特判？因为题目说了s.length()>=1
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('||s.charAt(i) == '[' || s.charAt(i) == '{'){    //前半个括号直接进栈
                stack.push(s.charAt(i));
            }else if(!stack.empty()    //如果来了个右括号，此时栈为空，可断定false
                    //如果栈不空，而且满足下列条件，达成括号匹配，则pop
                                  && (stack.peek() == '(' && s.charAt(i) == ')'
                                   || stack.peek() == '{' && s.charAt(i) == '}'
                                   || stack.peek() == '[' && s.charAt(i) == ']')){
                stack.pop();
            }else {
                return false;    //如果来了个右括号，此时栈为空，可断定false，如果不能括号匹配,false
            }
        }
        if (stack.empty()){    //如果最后栈空，则表示括号匹配成功
            return true;
        }
        return false;    //如果最后栈不空，表示括号匹配失败，false
    }
}