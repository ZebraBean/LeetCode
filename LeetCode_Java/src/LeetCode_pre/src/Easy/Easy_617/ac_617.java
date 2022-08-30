package Easy.Easy_617;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/1/5
 * Time: 12:52
 * Description: No Description
 */
public class ac_617 {
}
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        TreeNode merged = new TreeNode(t1.val + t2.val);
        merged.left = mergeTrees(t1.left, t2.left);
        merged.right = mergeTrees(t1.right, t2.right);
        return merged;
    }
}

//class Solution {
//    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
//        if(root1 == null){
//            return root2;
//        }
//        if (root2 == null){
//            return root1;
//        }
//        Queue<TreeNode> queue1 = new LinkedList<>();
//        Queue<TreeNode> queue2 = new LinkedList<>();
//        queue1.add(root1);
//        queue2.add(root2);
//        while (!queue1.isEmpty() && !queue2.isEmpty()){
//            TreeNode node1 = queue1.remove();
//            TreeNode node2 = queue2.remove();
//            if (node1 != null && node2 != null){
//                queue1.add(node1.left);
//                queue1.add(node1.right);
//                queue2.add(node2.left);
//                queue2.add(node2.right);
//                node1.val = node1.val + node2.val;
//                if (node1.left == null && node2.left != null){
//                    node1.left = node2.left;
//                }
//                if (node1.right == null && node2.right != null){
//                    node1.right = node2.right;
//                }
//            }
//        }
//        return root1;
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