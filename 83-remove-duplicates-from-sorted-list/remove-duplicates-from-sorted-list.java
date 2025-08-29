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
    public ListNode deleteDuplicates(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode first=head,last=head.next;
        while(last!=null){
            if(first.val==last.val){
                if(last.next==null){
                    first.next=null;
                }
                last=last.next;
            }
            else{
                first.next=last;
                first=last;
                last=last.next;
            }
        }
        return head;
    }
}