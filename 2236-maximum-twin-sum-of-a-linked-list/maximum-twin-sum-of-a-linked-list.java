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
    public int pairSum(ListNode head){
        if(head==null){
            return 0;
        }
        int maxsum=Integer.MIN_VALUE;
        ListNode fast=head;
        ListNode slow=head;
        int n=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            n+=2;
        }
        if(n==2){
            return head.val+head.next.val;
        }
        ListNode prev=null;
        ListNode curr=slow;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        while(prev!=null){
            maxsum=Math.max(maxsum,head.val+prev.val);
            head=head.next;
            prev=prev.next;
        }
        return maxsum;
    }
}