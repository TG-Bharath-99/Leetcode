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
    public ListNode partition(ListNode head, int x){
        ListNode small=new ListNode(3162);
        ListNode dummy=small;
        ListNode large=new ListNode(3161);
        ListNode largeHold=large;
        while(head!=null){
            if(head.val<x){
                small.next=head;
                small=small.next;
            }
            else{
                large.next=head;
                large=large.next;
            }
            head=head.next;
        }
        large.next=null;
        small.next=largeHold.next;
        return dummy.next;
    }
}