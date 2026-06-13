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
        int x=k;
        int len=0;
        ListNode temp=head;
        ListNode extra=null;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        temp=head;
        ListNode prev=null;
        ListNode curr=temp;
        ListNode first=curr;
        for(int i=0;i<len/k;i++){
            while(x!=0){
                ListNode next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
                x--;
            }
            if(i==0) head=prev;
            x=k;
            first.next=curr;
            if(extra!=null) extra.next=prev;
            extra=first;
            first=curr;
            prev=null;
        }
        return head;
    }
}