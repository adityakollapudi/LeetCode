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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> li=new ArrayList<>();
        if(root==null)return li;
        List<List<Integer>> l1=new ArrayList<>();
        Queue<TreeNode> qu=new LinkedList<>();
        qu.add(root);
      //  li.add(new ArrayList<>().add(root.val));
        while(!qu.isEmpty()){
            List<Integer> l2=new ArrayList<>();
            int levelsize=qu.size();
            for(int i=0;i<levelsize;i++){
                TreeNode curr=qu.poll();
                l2.add(curr.val);
                if(curr.left!=null){
                    qu.add(curr.left);
                }
                if(curr.right!=null){
                    qu.add(curr.right);
                }
            }
            l1.add(l2);
        }
        for(List<Integer> list:l1){
            li.add(list.get(list.size()-1));
        }
        return li;

    }
}