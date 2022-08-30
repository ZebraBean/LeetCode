package Easy.Easy_606;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/1/3
 * Time: 10:03
 * Description: No Description
 */
public class ac_606 {
    
}

class Solution {
    public StringBuffer s = new StringBuffer();
    public String tree2str(TreeNode root) {
        preOrder(root);
        return s.toString();
    }
    public void preOrder(TreeNode root){
        if (root != null){
            s.append(root.val);
            if (root.left != null || (root.left == null && root.right != null)){
                s.append("(");
                preOrder(root.left);
                s.append(")");
            }
            if (root.right != null){
                s.append("(");
                preOrder(root.right);
                s.append(")");
            }
        }
    }
}
//class Solution {
//    public String tree2str(TreeNode root) {
//        if (root == null){
//            return "";
//        }
//        StringBuffer s = new StringBuffer();
//        Stack<TreeNode> stack = new Stack<>();
//        Set<TreeNode> visited = new HashSet<>();
//        stack.push(root);
//        while (!stack.isEmpty()){
//            TreeNode node = stack.peek();
//            if (!visited.contains(node)){
//                s.append("(");
//                s.append(node.val);
//                visited.add(node);
//                if (node.left == null && node.right != null){
//                    s.append("()");
//                }
//                if (node.right != null){
//                    stack.push(node.right);
//                }
//                if (node.left != null){
//                    stack.push(node.left);
//                }
//            }else {
//                s.append(")");
//                stack.pop();
//            }
//
//        }
//        return s.toString().substring(1,s.length()-1);
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