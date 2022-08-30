package LeetCode.Easy_232;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2021/12/21
 * Time: 18:15
 * Description: No Description
 */
public class wa_232 {
}

class MyQueue {
    Stack<Integer> stack;
    Stack<Integer> temp;

    public MyQueue() {
        stack = new Stack<>();
        temp = new Stack<>();
    }

    public void push(int x) {
        temp.push(x);
    }

    public int pop() {
        if (!stack.isEmpty()){
            return stack.pop();
        }else {
            while (!temp.isEmpty()){
                stack.push(temp.pop());
            }
            return stack.pop();
        }
    }

    public int peek() {
        if (!stack.isEmpty()){
            return stack.peek();
        }else {
            while (!temp.isEmpty()){
                stack.push(temp.pop());
            }
            return stack.peek();
        }
    }

    public boolean empty() {
        if (stack.isEmpty() && temp.isEmpty()){
            return true;
        }
        return false;
    }
}