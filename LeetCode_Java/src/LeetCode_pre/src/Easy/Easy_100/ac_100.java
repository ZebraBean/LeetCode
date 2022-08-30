package Easy.Easy_100;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2021/12/27
 * Time: 17:25
 * Description: No Description
 */
public class ac_100 {
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

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null){
            return true;
        }  //都为空，那就是相等
        if (p != null && q != null){  //都不空，根节点相同，左右子树分别相同，那就相同
            return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }else {  //另外其他一个空一个不空的情况，那就是不相同
            return false;
        }
    }
}