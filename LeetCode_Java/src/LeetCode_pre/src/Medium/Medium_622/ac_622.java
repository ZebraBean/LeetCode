package Medium.Medium_622;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2021/12/23
 * Time: 17:56
 * Description: No Description
 */
public class ac_622 {
    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue(8);
        System.out.println(myCircularQueue.enQueue(3));
        myCircularQueue.enQueue(9);
        myCircularQueue.enQueue(5);
        System.out.println(myCircularQueue.enQueue(0));
    }
}
class MyCircularQueue {
    int[] myQueue;
    int front;
    int rear;
    boolean isEmpty;

    public MyCircularQueue(int k) {
        myQueue = new int[k];
        front = 0;
        rear = 0;
        isEmpty = true;
    }

    public boolean enQueue(int value) {
        if (isFull()){
            return false;
        }
        if (isEmpty()){
            isEmpty = false;
        }
        myQueue[rear] = value;
        rear = (rear+1) % myQueue.length;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()){
            return false;
        }
        front = (front+1) % myQueue.length;
        if (front == rear){
            isEmpty = true;
        }
        return true;
    }

    public int Front() {
        if (isEmpty()){
            return -1;
        }
        return myQueue[front];
    }

    public int Rear() {
        if (isEmpty()){
            return -1;
        }
        if (rear == 0){
            return myQueue[myQueue.length-1];
        }else {
            return myQueue[rear-1];
        }
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public boolean isFull() {
        return !isEmpty && front == rear;
    }
}