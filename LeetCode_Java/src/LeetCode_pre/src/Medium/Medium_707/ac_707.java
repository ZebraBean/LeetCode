package LeetCode.Meduim_707;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2021/12/20
 * Time: 14:39
 * Description: No Description
 */
public class ac_707 {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);




        linkedList.addAtIndex(1,2);   //链表变为1-> 2-> 3
        Node cur = linkedList.head;

        while (cur != null){
            System.out.print(cur.val+", ");
            cur = cur.next;
        }
        linkedList.get(1);            //返回2
        linkedList.deleteAtIndex(1);  //现在链表是1-> 3
        linkedList.get(1);            //返回3


    }
}
class Node {
    int val;
    Node next;
    Node prev;
    public Node(int val) {
        this.val = val;
    }
}

class MyLinkedList {
    int size;
    Node head;
    Node tail;

    public MyLinkedList() {
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index > size-1){
            return -1;
        }
        if (index == 0) {
            return head.val;
        }
        if (index == size-1){
            return tail.val;
        }
        return findPrevNode(index).next.val;

    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        if (head == null){
            head = node;
            tail = node;
        }else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }

    public void addAtTail(int val) {
        Node node = new Node(val);
        if (head == null){
            head = node;
            tail = node;
        }else {
            tail.next = node;
            node.prev = tail;
            tail = tail.next;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if(index > size){
            return;
        }
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            size++;
            return;
        }
        if (index <= 0) {
            addAtHead(val);
            return;
        }
        if (index == size){
            addAtTail(val);
            return;
        }
        Node curPrev = findPrevNode(index);
        node.next = curPrev.next;
        curPrev.next.prev = node;
        node.prev = curPrev;
        curPrev.next = node;
        size++;
    }
    public Node findPrevNode(int index){  //找到Index的前一个结点
        //务必画图啊啊啊啊啊啊
        Node curPrev;  //找到下标位置的前一个元素
        if(index-1 < size/2){  //要找到index-1位置的元素，那么判断从前找还是从后面找更快
            curPrev = head;
            for (int i = 0; i < index-1; i++) {  //不懂画图举例
                curPrev = curPrev.next;
            }
        }else {
            curPrev = tail;
            for (int i = 0; i < size-index; i++) {  //不懂画图举例
                curPrev = curPrev.prev;
            }
        }
        return curPrev;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index > size-1){
            return;
        }
        if (size == 1){
            head = null;
            tail = null;
            size--;
            return;
        }
        if (index == 0){
             head = head.next;
             head.prev = null;
             size--;
             return;
        }
        if (index == size-1){
            tail = tail.prev;
            tail.next = null;
            size--;
            return;
        }
        Node curPrev = findPrevNode(index);
        Node curNext = curPrev.next.next;
        curPrev.next = curNext;
        curNext.prev = curPrev;
        size--;
    }
}