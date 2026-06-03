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
class Solution{
    public void reorderList(ListNode head){
        ListNode dummy=new ListNode(3162);
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode extra=slow.next;
        slow.next=null;
        ListNode prev=null;
        ListNode curr=extra;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        while(head!=null && prev!=null){
            ListNode next1=head.next;
            ListNode next2=prev.next;
            dummy.next=head;
            dummy=dummy.next;
            dummy.next=prev;
            dummy=dummy.next;
            head=next1;
            prev=next2;
        }
        if(head!=null){
            dummy.next=head;
        }
    }
}