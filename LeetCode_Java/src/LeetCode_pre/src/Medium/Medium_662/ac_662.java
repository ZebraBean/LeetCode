package Medium.Medium_662;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/1/3
 * Time: 23:05
 * Description: No Description
 */
public class ac_662 {
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Deque<MyNode> queue = new LinkedList<>();
        int ans = 0;
        queue.add(new MyNode(root,0,0));
        while (!queue.isEmpty()){
            int size = queue.size();
            ans = Math.max(queue.getLast().pos-queue.getFirst().pos+1,ans);
            while (size > 0){
                MyNode myNode = queue.remove();
                if (myNode.node.left != null){
                    queue.add(new MyNode(myNode.node.left,myNode.depth+1,myNode.pos*2+1));
                }
                if (myNode.node.right != null){
                    queue.add(new MyNode(myNode.node.right,myNode.depth+1,myNode.pos*2+2));
                }
                size--;
            }
        }
        return ans;
    }
}
class MyNode{
    TreeNode node;
    int depth;
    int pos;

    public MyNode(TreeNode node, int depth, int pos) {
        this.node = node;
        this.depth = depth;
        this.pos = pos;
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