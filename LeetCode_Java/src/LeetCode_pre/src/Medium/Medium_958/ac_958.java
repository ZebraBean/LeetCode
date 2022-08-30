package Medium.Medium_958;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/1/4
 * Time: 18:40
 * Description: No Description
 */
public class ac_958 {
}
class Solution {
    public boolean isCompleteTree(TreeNode root) {
        if (root == null){
            return false;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            if (node != null) {
                queue.add(node.left);
                queue.add(node.right);
            } else { //node == null
                while (node == null && !queue.isEmpty()) {
                    node = queue.peek();  //用这种方式来删除空，不能直接remove，会把最后不是null的remove出来
                    if (node == null){
                        queue.remove();
                    }
                }
                if (queue.isEmpty()){
                    return true;
                }else {
                    return false;
                }
            }
        }
        return true;
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