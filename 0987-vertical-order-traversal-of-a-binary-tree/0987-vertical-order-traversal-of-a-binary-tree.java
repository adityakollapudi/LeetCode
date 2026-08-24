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
    class Tuple{
        TreeNode node;
        int column;
        int row;
        public Tuple(TreeNode node,int row,int column){
            this.node=node;
            this.row=row;
            this.column=column;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> li=new ArrayList<>();
        List<Tuple> l1=new ArrayList<>();
        Queue<Tuple> qu=new LinkedList<>();
        Tuple t=new Tuple(root,0,0);
        qu.offer(t);
        while(!qu.isEmpty()){
            Tuple curr=qu.poll();
            l1.add(curr);
            if(curr.node.left!=null){
                qu.offer(new Tuple(curr.node.left,curr.row+1,curr.column-1));
            }
            if(curr.node.right!=null){
                qu.offer(new Tuple(curr.node.right,curr.row+1,curr.column+1));
            }
        }

        Collections.sort(l1,(a,b)->{
            if (a.column!=b.column) {
                return a.column-b.column;
            }

            if (a.row!=b.row) {
                return a.row - b.row;
            }

            return a.node.val-b.node.val;
        });

         int currentColumn = Integer.MIN_VALUE;

        for (Tuple t1 : l1) {

            if (t1.column != currentColumn) {
                li.add(new ArrayList<>());
                currentColumn = t1.column;
            }

            li.get(li.size() - 1).add(t1.node.val);
        }



        return li;
    }
}