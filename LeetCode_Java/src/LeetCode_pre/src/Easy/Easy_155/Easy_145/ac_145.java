package Easy.Easy_145;
import java.util.*;
/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2021/12/27
 * Time: 16:14
 * Description: No Description
 */
public class ac_145 {
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }
        Deque<TreeNode> stack = new LinkedList<>();
//        Set<TreeNode> set = new HashSet<>();

//        stack.push(root);
//        while (!stack.isEmpty()){
//            TreeNode node = stack.peek();
//            if(!set.contains(node)){
//                set.add(node);
//                if (node.right != null){
//                    stack.push(node.right);
//                }
//                if (node.left != null){
//                    stack.push(node.left);
//                }
//            }else {
//                res.add(node.val);
//                stack.pop();
//            }
//        }
        TreeNode node = root;
        TreeNode prev = null;
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            if (node.right == null || node.right == prev) {
                //如果右子树为空，或者右子树之前已经遍历过了，那就是从右边上来的，保存当前node为prev表示已经遍历完了
                //然后把当前node置空，终止当前node的遍历
                res.add(node.val);
                prev = node;
                node = null;
            } else {  //如果右子树不为空而且没有被遍历过，那就是从左边上来的，往右走就行
                stack.push(node);  //这里必须再将当前结点push进去，因为当前结点后面还要访问一次
                node = node.right;
            }
        }
        return res;
    }
}