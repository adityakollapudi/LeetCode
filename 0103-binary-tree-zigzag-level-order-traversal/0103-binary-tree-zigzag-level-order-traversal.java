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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null) return new ArrayList<>();
        int itr=0;
        Queue<TreeNode> qu=new LinkedList<>();
        List<List<Integer>> li=new ArrayList<>();
        qu.offer(root);
        while(!qu.isEmpty()){
            int size=qu.size();
            ArrayList<Integer> l1=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=qu.poll();
                l1.add(node.val);
                if(node.left!=null){
                    qu.offer(node.left);
                }
                if(node.right!=null){
                    qu.offer(node.right);
                }
            }
            if(itr%2!=0){
                Collections.reverse(l1);
            }
            li.add(l1);
            itr+=1;
        }
        return li;
    }
}