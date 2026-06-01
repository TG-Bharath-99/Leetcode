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
    public ListNode swapPairs(ListNode head){
        ListNode dummy=new ListNode(3162);
        dummy.next=head;
        ListNode prev=dummy;
        while(prev.next!=null && prev.next.next!=null){
            ListNode one=prev.next;
            ListNode two=one.next;
            one.next=two.next;
            two.next=one;
            prev.next=two;
            prev=one;
        }
        return dummy.next;
    }
}