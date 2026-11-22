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
        if(k==0 || k==1) return head;
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        int x=len/k;
        ListNode ans=null;
        ListNode lastprev=null;
        temp=head;
        for(int i=0;i<x;i++){
            ListNode prev=null;
            ListNode curr=temp;
            for(int j=0;j<k;j++){
                ListNode next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            if(ans==null) ans=prev;
            if(lastprev==null){
                lastprev=temp;
            }
            else{
                lastprev.next=prev;
                lastprev=temp;
            }
            temp=curr;
            if(i==x-1){
                lastprev.next=curr;
            }
        }
        return ans;
    }
}