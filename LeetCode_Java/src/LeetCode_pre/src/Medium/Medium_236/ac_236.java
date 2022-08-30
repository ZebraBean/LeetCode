package Medium.Medium_236;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/1/3
 * Time: 15:09
 * Description: No Description
 */
public class ac_236 {
}
class Solution {

    private TreeNode ans;

    public Solution() {
        this.ans = null;
    }

    private boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        //返回值的含义是以root为根的树中是否含有p或者q
        if (root == null) return false;
        boolean lson = dfs(root.left, p, q);//自底向上的思路，去左子树中先找
        boolean rson = dfs(root.right, p, q);
        //如果左子树和右子树中都有p或者q，那么必然是一个在左子树一个在右子树，ans=root
        //如果根节点的值=p或者q,并且另一个结点在左子树或者右子树当中，ans=root
        //否则，什么都不做
        if ((lson && rson) || ((root.val == p.val || root.val == q.val) && (lson || rson))) {
            ans = root;
        }
        //如果左子树中有，或者右子树中有，或者当前的根节点的值=p或者q，都代表以root为根的树中含有p或者q，返回true
        return lson || rson || (root.val == p.val || root.val == q.val);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        this.dfs(root, p, q);
        return this.ans;
    }
}

//class Solution {
//    boolean flag1 = false;
//    boolean flag2 = false;
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if (root == null){
//            return null;
//        }
//        TreeNode left1 = lowestCommonAncestor(root.left,p,q);
//        TreeNode right1 = lowestCommonAncestor(root.right,p,q);
//        if ( left1 != null){
//            return left1;
//        }
//        if ( right1 != null){
//            return right1;
//        }
//        flag1 = false;
//        flag2 = false;
//        preOrder(root, p, q);
//        if (flag1 && flag2){
//            return root;
//        }
//        return null;
//    }
//    public void preOrder(TreeNode root,TreeNode p, TreeNode q){
//        if (root != null){
//            if (root.val == p.val){
//                flag1 = true;
//            }
//            if (root.val == q.val){
//                flag2 = true;
//            }
//            preOrder(root.left, p, q);
//            preOrder(root.right, p, q);
//        }
//    }
//}
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