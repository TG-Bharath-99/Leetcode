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
    public ListNode deleteDuplicates(ListNode head){
        ListNode dummy=new ListNode(3162);
        ListNode temp=dummy;
        temp.next=head;
        while(head!=null && head.next!=null){
            while(head!=null && head.next!=null && head.val==head.next.val){
                head=head.next;
            }
            head=head.next;
            temp=temp.next;
            temp.next=head;
        }
        return dummy.next;
    }
}