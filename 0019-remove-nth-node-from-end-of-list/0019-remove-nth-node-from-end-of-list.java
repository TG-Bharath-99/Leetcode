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
    public ListNode removeNthFromEnd(ListNode head, int n){
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        if(len==1 && n==1) return null;
        if(len-n==0) return head.next;
        temp=null;
        for(int i=0;i<len-n;i++){
            temp=(temp==null)?head:temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}