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
    public ListNode deleteDuplicates(ListNode head){
        ListNode dummy=new ListNode(3162);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode curr=head;
        while(curr!=null && curr.next!=null){
            int x=0;
            while(curr!=null && curr.next!=null && curr.val==curr.next.val){
                curr.next=curr.next.next;
                x++;
            }
            if(x!=0){
                prev.next=curr.next;
                curr=prev.next;
            }
            else{
                prev=curr;
                curr=curr.next;
            }
        }
        return dummy.next;
    }
}