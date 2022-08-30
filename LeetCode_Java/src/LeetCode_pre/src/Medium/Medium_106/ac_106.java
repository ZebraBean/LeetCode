package Medium.Medium_106;


import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/1/2
 * Time: 15:04
 * Description: No Description
 */
public class ac_106 {
    public static void main(String[] args) {
        int[] inorder = new int[]{9,3,15,20,7};
        int[] postorder = new int[]{9,15,7,20,3};
        Solution solution = new Solution();
        TreeNode root = solution.buildTree(inorder,postorder);
        inOrder(root);

    }
    public static void inOrder(TreeNode root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
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

class Solution {
    Map<Integer,Integer> hashMap = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for(int i = 0; i < inorder.length; i++){
            hashMap.put(inorder[i],i);
        }
        return myBuildTree(inorder,postorder,0,inorder.length-1,0,postorder.length-1);
    }
    public TreeNode myBuildTree(int[] inorder,int[] postorder,int InorderStart,int InorderEnd,int PostorderStart,int PostorderEnd) {
        //不动两个数组，用InorderStart,InorderEnd来表示当前树的中序序列的区间
        if (InorderEnd < InorderStart && PostorderEnd < PostorderStart){
            return null;
        }
        if (InorderEnd-InorderStart == 0 && PostorderEnd-PostorderStart == 0){
            return new TreeNode(postorder[PostorderEnd]);
        }
        TreeNode root = new TreeNode(postorder[PostorderEnd]);
        int inOrderRootPos = hashMap.get(postorder[PostorderEnd]);
        int leftAmount = inOrderRootPos-InorderStart;
        root.left = myBuildTree(inorder,postorder,InorderStart,inOrderRootPos-1,PostorderStart,PostorderStart+leftAmount-1);
        root.right = myBuildTree(inorder,postorder,inOrderRootPos+1,InorderEnd,PostorderStart+leftAmount,PostorderEnd-1);
        return root;
    }
}