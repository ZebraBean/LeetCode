package Easy.Easy_110;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2021/12/28
 * Time: 17:11
 * Description: No Description
 */
public class ac_110 {
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
//class Solution {
//    public boolean isBalanced(TreeNode root) {
//        if (root == null){
//            return true;
//        }
//        return Math.abs(TreeHeight(root.right) - TreeHeight(root.left)) <= 1
//                &&isBalanced(root.left)
//                &&isBalanced(root.right);
//    }
//    public static int TreeHeight(TreeNode root){
//        if (root == null){
//            return 0;
//        }
//        return Math.max(TreeHeight(root.left),TreeHeight(root.right))+1;
//    }
//}

class Solution {
    public boolean isBalanced(TreeNode root) {
        return TreeHeight(root) >= 0;
    }
    public static int TreeHeight(TreeNode root){
        if (root == null){
            return 0;
        }
        int leftHeight = TreeHeight(root.left);
        int rightHeight = TreeHeight(root.right);
        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1){
            return -1;
        }else {
            return Math.max(leftHeight,rightHeight)+1;
        }
    }
}