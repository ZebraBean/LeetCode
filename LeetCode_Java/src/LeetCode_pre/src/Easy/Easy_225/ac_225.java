package LeetCode.Easy_225;


import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2021/12/21
 * Time: 12:11
 * Description: No Description
 */
public class ac_225 {
}
class MyStack {
    Queue<Integer> queue;  //栈
    Queue<Integer> temp;  //用于临时存储新加入的那一个元素

    public MyStack() {
        queue = new LinkedList<Integer>();
        temp = new LinkedList<Integer>();
    }

    public void push(int x) {
        temp.add(x);  //每新加入一个元素，就放入temp，然后把栈中的元素顶到它后面
        while(!queue.isEmpty()){
            temp.add(queue.remove());
        }
        Queue<Integer> temp2 = temp;
        temp = queue;
        queue = temp2;
    }

    public int pop() {
        return queue.remove();
    }

    public int top() {
        return queue.element();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}