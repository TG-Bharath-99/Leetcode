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
    public ListNode mergeKLists(ListNode[] lists){
        ListNode dummy=new ListNode(3162);
        ListNode ans=dummy;
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->Integer.compare(a,b));
        for(ListNode head : lists){
            while(head!=null){
                pq.offer(head.val);
                head=head.next;
            }
        }
        while(!pq.isEmpty()){
            ans.next=new ListNode(pq.poll());
            ans=ans.next;
        }
        return dummy.next;
    }
}