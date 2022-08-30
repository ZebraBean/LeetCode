package Easy.Easy_897;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/1/4
 * Time: 23:21
 * Description: No Description
 */
public class ac_897 {
}
class Solution {
    TreeNode head;
    TreeNode last;
    public TreeNode increasingBST(TreeNode root) {
        inOrder(root);
        last.right = null;
        last.left = null;
        return head;
    }
    public void inOrder(TreeNode root){
        if (root != null) {
            inOrder(root.left);
            add(root);
            inOrder(root.right);
        }
    }
    public void add(TreeNode node){
        if (head == null){
            head = node;
            last = node;
        }else {
            last.right = node;
            node.left = null;
            last = node;
        }
    }
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
