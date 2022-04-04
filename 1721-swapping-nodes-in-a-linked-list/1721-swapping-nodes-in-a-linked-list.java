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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=head,second=head;
        if(head==null || head.next==null)
            return head;
        for(int i=0;i<k-1;i++)
        {
           fast=fast.next;
        }
        temp=fast;
        ListNode curr=head;
        
        while(fast.next!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        second=slow;
        
       int x=temp.val;
        temp.val=second.val;
        second.val=x;
        return head;
    }
}