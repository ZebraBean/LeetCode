package Medium.Medium_105;


import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/1/1
 * Time: 19:12
 * Description: No Description
 */
public class ac_105 {

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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 && inorder.length == 0){
            return null;
        }
        if (preorder.length == 1 && inorder.length == 1){
            return new TreeNode(preorder[0]);
        }

        TreeNode root = new TreeNode(preorder[0]);
        int rootPos = getPosByValue(inorder,preorder[0]);
        int leftAmount = rootPos;

        int[] leftPreOrder = Arrays.copyOfRange(preorder,1,leftAmount+1);
        int[] rightPreOrder = Arrays.copyOfRange(preorder,leftAmount+1,preorder.length);
        int[] leftInOrder = Arrays.copyOfRange(inorder,0,rootPos);
        int[] rightInOrder = Arrays.copyOfRange(inorder,rootPos+1,inorder.length);

        TreeNode left = buildTree(leftPreOrder,leftInOrder);
        TreeNode right = buildTree(rightPreOrder,rightInOrder);
        root.left = left;
        root.right = right;
        return root;
    }
    public int getPosByValue(int[] inorder, int value) {
        for (int i = 0; i < inorder.length; i++) {
            if (value == inorder[i]) {
                return i;
            }
        }
        return -99;
    }
}