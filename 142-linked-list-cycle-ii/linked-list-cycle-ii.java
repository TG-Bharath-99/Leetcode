/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head){
        if(head==null){
            return head;
        }
        if(head.next==null){
            return null;
        }
        int len=0;
        ListNode slow=head,fast=head.next;
        while(fast!=null && fast.next!=null){
            if(slow==fast){
                do{
                    slow=slow.next;
                    len++;
                }while(slow!=fast);
                break;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast==null || fast.next==null){
            return null;
        }
        ListNode temp=head;
        while(len>0){
            temp=temp.next;
            len--;
        }
        while(temp!=head){
            temp=temp.next;
            head=head.next;
        }
        return head;
    }
}