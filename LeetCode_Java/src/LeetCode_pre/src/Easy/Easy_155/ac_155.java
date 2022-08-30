package LeetCode.Easy_155;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2021/12/22
 * Time: 15:48
 * Description: No Description
 */
public class ac_155 {
}
class MinStack {
    int[] stack;
    int top;
    int min;

    public MinStack() {
        stack = new int[100005];
        top = 0;
        min = Integer.MAX_VALUE;
    }

    public void push(int val) {
        if (val < min){
            min = val;
        }
        stack[top++] = val;
    }

    public void pop() {
        int toPop = stack[top-1];
        min = findResMin();
        top--;
    }

    public int findResMin(){
        int resMin = Integer.MAX_VALUE;
        for (int i = 0; i < top-1; i++) {
            if (stack[i] < resMin){
                resMin = stack[i];
            }
        }
        return resMin;
    }

    public int top() {
        return stack[top-1];
    }

    public int getMin() {
        return min;
    }
}
