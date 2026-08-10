/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
      if(head==null || head.next==null)return head;
      ListNode list=head;
      ListNode mid=middle(list);
      ListNode right=mid.next;
      mid.next=null;
      ListNode leftsorted=sortList(list);
      ListNode rightsorted=sortList(right);
      return merge(leftsorted,rightsorted);
    }
    public ListNode middle(ListNode list){
        ListNode slow=list;
        ListNode fast=slow.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode merge(ListNode left,ListNode right){
        ListNode dummy=new ListNode(0);
        ListNode list=dummy;
        while(left!=null && right!=null){
            if(left.val<=right.val){
                list.next=left;
                left=left.next;
            }else{
                list.next=right;
                right=right.next;
            }
            list=list.next;
        }
        if(left!=null)list.next=left;
        if(right!=null)list.next=right;
        return dummy.next;
    }
}