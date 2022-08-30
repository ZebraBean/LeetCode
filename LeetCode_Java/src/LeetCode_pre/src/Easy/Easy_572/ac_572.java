package Easy.Easy_572;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2021/12/28
 * Time: 14:50
 * Description: No Description
 */
public class ac_572 {
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
    static boolean ans;
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return hasSubtree(root,subRoot);
    }

    public boolean hasSubtree(TreeNode root,TreeNode subRoot) {
        //如果树是空，那就是false。
        //不为空，暴力判断是否是同一棵树，是就返回true
        //如果不是同一棵树，那就判断坐子树和右子树，有一个有就返回true
        if (root == null) {
            return false;
        }
        if (isSameTree(root,subRoot)){
            return true;
        }
        return hasSubtree(root.left,subRoot) || hasSubtree(root.right,subRoot);
    }
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