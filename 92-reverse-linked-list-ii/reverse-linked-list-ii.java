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
    public ListNode reverseBetween(ListNode head, int left, int right){
        if(head==null || head.next==null || left==right){
            return head;
        }
        ListNode ans=new ListNode(3162);
        ans.next=head;
        ListNode last=ans;
        for(int i=0;i<left-1;i++){
            last=last.next;
        }
        ListNode temp=last.next;
        ListNode prev=null,curr=temp,nextnode=temp;
        for(int i=0;(nextnode!=null && i<(right-left+1));i++){
            nextnode=nextnode.next;
            curr.next=prev;
            prev=curr;
            curr=nextnode;
        }
        last.next=prev;
        temp.next=curr;
        return ans.next;
    }
}