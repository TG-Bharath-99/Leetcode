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
    public ListNode reverseKGroup(ListNode head, int k){
        ListNode dummy=new ListNode(3162);
        dummy.next=head;  
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        ListNode prev=null;
        ListNode first=head;
        ListNode hold=null;
        for(int i=0;i<(len/k);i++){
            int c=0;
            ListNode curr=first;
            while(c!=k && curr!=null){
                ListNode next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
                c++;
            }
            if(hold==null) dummy.next=prev;
            else hold.next=prev;
            first.next=curr;
            hold=first;
            first=curr;
            prev=null;
        }
        return dummy.next;
    }
}