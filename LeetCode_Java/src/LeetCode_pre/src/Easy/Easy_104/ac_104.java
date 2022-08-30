package Easy.Easy_104;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2021/12/28
 * Time: 15:54
 * Description: No Description
 */
public class ac_104 {
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
//    public int maxDepth(TreeNode root) {
//        if (root == null){
//            return 0;
//        }
//        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
//    }
//}

class Solution {
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int depth = 0;
        if (root != null){
            queue.add(root);
        }
        while (!queue.isEmpty()){
            int size = queue.size();
            while (size > 0) {
                TreeNode node = queue.remove();
                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }
                size--;
            }
            depth++;
        }
        return depth;
    }
}