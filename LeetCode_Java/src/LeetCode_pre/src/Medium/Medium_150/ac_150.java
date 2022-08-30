package Medium.Medium_150;


import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2021/12/22
 * Time: 16:33
 * Description: No Description
 */
public class ac_150 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                switch (token){
                    case "+":{
                        stack.push(b+a);
                        break;
                    }
                    case "-":{
                        stack.push(b-a);
                        break;
                    }
                    case "*":{
                        stack.push(b*a);
                        break;
                    }
                    case "/":{
                        stack.push(b/a);
                        break;
                    }
                }
            }else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}