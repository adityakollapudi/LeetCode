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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null)return new ArrayList<>();
        List<List<Integer>> li=new ArrayList<>();
        Queue<TreeNode> qu=new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            int size=qu.size();
            ArrayList<Integer> l1=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr=qu.poll();
                l1.add(curr.val);
                if(curr.left!=null){
                    qu.add(curr.left);
                }
                if(curr.right!=null){
                    qu.add(curr.right);
                }
            }
            li.add(l1);
        }
        return li;
    }
}