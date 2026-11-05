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
    public ListNode rotateRight(ListNode head, int k){
        if(k==0 || head==null) return head;
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        if(k==len || k%len==0) return head;
        k%=len;
        temp=head;
        for(int i=0;i<len-k-1;i++){
            temp=temp.next;
        }
        ListNode curr=temp.next;
        temp.next=null;
        ListNode move=curr;
        while(move!=null && move.next!=null){
            move=move.next;
        }
        if(move!=null) move.next=head;
        return (curr==null)?temp:curr;
    }
}