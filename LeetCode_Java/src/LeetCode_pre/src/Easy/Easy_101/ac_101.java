package Easy.Easy_101;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2021/12/27
 * Time: 17:40
 * Description: No Description
 */
public class ac_101 {
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
//    public boolean isSymmetric(TreeNode root) {
//        if (root == null){
//            return true;
//        }
//        return isMirror(root.left,root.right);
//    }
//
//    public static boolean isMirror(TreeNode t1, TreeNode t2){
//        if (t1 == null && t2 == null){
//            return true;
//        }//
//        if (t1 != null && t2 != null){
//            //两个子树互为镜像要满足以下三个条件
//            return t1.val == t2.val
//                    && isMirror(t1.left,t2.right)
//                    && isMirror(t1.right,t2.left);
//        }else {
//            return false;
//        }
//    }
//}
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null || (root.left==null && root.right==null)) {
            return true;
        }
        //用队列保存节点
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        //将根节点的左右孩子放到队列中
        queue.add(root.left);
        queue.add(root.right);
        while(queue.size()>0) {
            //从队列中取出两个节点，再比较这两个节点
            TreeNode left = queue.removeFirst();
            TreeNode right = queue.removeFirst();
            //如果两个节点都为空就继续循环，两者有一个为空就返回false
            if(left==null && right==null) {
                continue;  //如果都为空，那就什么都不执行
            }
            if(left==null || right==null) {
                return false;
            }
            if(left.val!=right.val) {
                return false;
            }

            //走到这里说明，两个根节点相等

            //将左节点的左孩子， 右节点的右孩子放入队列
            queue.add(left.left);
            queue.add(right.right);
            //将左节点的右孩子，右节点的左孩子放入队列
            queue.add(left.right);
            queue.add(right.left);
        }

        return true;
    }
}