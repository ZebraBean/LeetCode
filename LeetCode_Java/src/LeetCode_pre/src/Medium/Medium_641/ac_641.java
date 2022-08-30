package LeetCode.Medium_641;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2021/12/24
 * Time: 17:40
 * Description: No Description
 */
public class ac_641 {
}
class MyCircularDeque {
    int[] queue;
    int front;
    int rear;
    int size;

    public MyCircularDeque(int k) {
        queue = new int[k];
        front = 0;
        rear = 0;
        size = 0;
    }

    public boolean insertFront(int value) {
        if (isFull()){
            return false;
        }
        front = (front-1+queue.length)%queue.length;
        queue[front] = value;
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()){
            return false;
        }
        queue[rear] = value;
        rear = (rear+1)%queue.length;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()){
            return false;
        }
        front = (front+1)%queue.length;
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()){
            return false;
        }
        rear = (rear-1+queue.length)%queue.length;
        size--;
        return true;
    }

    public int getFront() {
        if (isEmpty()){
            return -1;
        }
        return queue[front];
    }

    public int getRear() {
        if (isEmpty()){
            return -1;
        }
        return queue[(rear-1+queue.length)%queue.length];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == queue.length;
    }
}