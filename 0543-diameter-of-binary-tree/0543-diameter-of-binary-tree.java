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
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
        height(root);
        return max;

    }
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int lf=height(root.left);
        int rg=height(root.right);
        max=Math.max(max,lf+rg);
        return 1+Math.max(lf,rg);
    }
}