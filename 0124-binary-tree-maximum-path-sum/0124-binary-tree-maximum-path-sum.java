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
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root==null)return 0;
        maxSum(root);
        return max;
    }
    public int maxSum(TreeNode root){
        if(root==null){
            return 0;
        }

        int lf=maxSum(root.left);
        if(lf<0)lf=0;
        int rg=maxSum(root.right);
        if(rg<0)rg=0;

        max=Math.max(max,root.val+lf+rg);
        max=Math.max(max,root.val);

        return root.val+Math.max(lf,rg);
    }
}