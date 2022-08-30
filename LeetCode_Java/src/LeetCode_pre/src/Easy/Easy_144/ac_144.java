package Easy.Easy_144;
import java.util.*;
/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2021/12/27
 * Time: 15:17
 * Description: No Description
 */
public class ac_144 {
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
//    List<Integer> list = new ArrayList<>();
//    public List<Integer> preorderTraversal(TreeNode root) {
//        if(root != null){
//            list.add(root.val);
//            preorderTraversal(root.left);
//            preorderTraversal(root.right);
//        }
//        return list;
//    }
//}

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null){
            return null;
        }

        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode node = root;
        while(!stack.isEmpty() || node != null) {
            while (node != null) {
                stack.push(node);
                list.add(node.val);
                node = node.left;
            }
            node = stack.pop();
            node = node.right;  //这一步的时候会出现stack里面是空，但是node不是空的情况
        }

//        stack.push(root);
//        while (!stack.isEmpty()){
//            TreeNode node = stack.pop();
//            list.add(node.val);
//            if (node.right != null){
//                stack.push(node.right);
//            }
//            if (node.left != null){
//                stack.push(node.left);
//            }
//        }
        return list;
    }
}
