package Medium.Medium_02;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 202/3/14
 * Time: 17:16
 * Description: No Descriptionr
 */
public class my {
    class Solution {
        //六个指针，让长的那个指针先往后走一走，边遍历边逆置链表
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode ans = new ListNode(-1); //带头结点的单链表
            ListNode anscur = ans;
            int up = 0;
            while (l1 != null && l2 != null){
                int sum = up+l1.val+l2.val;
                up = sum/10;
                sum = sum%10;
                ListNode node = new ListNode(sum);
                anscur.next = node;
                anscur = node;
                l1 = l1.next;
                l2 = l2.next;
            }
            while(l1 != null){
                int sum = up+l1.val;
                up = sum/10;
                sum = sum%10;
                ListNode node = new ListNode(sum);
                anscur.next = node;
                anscur = node;
                l1 = l1.next;
            }
            while(l2 != null){
                int sum = up+l2.val;
                up = sum/10;
                sum = sum%10;
                ListNode node = new ListNode(sum);
                anscur.next = node;
                anscur = node;
                l2 = l2.next;
            }
            if (up != 0){
                ListNode node = new ListNode(up);
                anscur.next = node;
                anscur = node;
            }
            return ans.next;
        }
    }
}
class ListNode {
      int val;
      ListNode next;
    ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
