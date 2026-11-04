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
    public ListNode reverseBetween(ListNode head, int left, int right){
        if(left==right) return head;
        ListNode before=null;
        ListNode temp=head;
        for(int i=0;i<left-1;i++){
            before=temp;
            temp=temp.next;
        }
        ListNode prev=null;
        ListNode curr=temp;
        ListNode hold=curr;
        for(int i=0;i<right-left+1;i++){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        if(before==null && curr==null){
            return prev;
        }
        if(before==null){
            head.next=curr;
            return prev;
        }
        if(curr==null){
            before.next=prev;
            return head;
        }
        before.next=prev;
        hold.next=curr;
        return head;
    }
}