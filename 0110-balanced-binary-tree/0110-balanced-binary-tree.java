/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        int lf=height(root.left);
        int rh=height(root.right);

        if(Math.abs(lf-rh)>1)return false;

        Boolean left=isBalanced(root.left);
        Boolean right=isBalanced(root.right);

        if(!left || !right)return false;

        return true;
    }
    public int height(TreeNode root){
        if(root==null)return 0;

        int lh=height(root.left);
        int rg=height(root.right);

        return 1+Math.max(lh,rg);
    }
}