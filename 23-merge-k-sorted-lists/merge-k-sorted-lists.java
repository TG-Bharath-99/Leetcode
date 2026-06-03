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
        if(lists.length==0){
            return null;
        }
        PriorityQueue<ListNode>pq=new PriorityQueue<>(Comparator.comparingInt(node->node.val));
        ListNode ans=new ListNode(3162);
        ListNode dummy=ans;
        int n=lists.length;
        if(n==1){
            return lists[0];
        }
        for(int i=0;i<n;i++){
            if(lists[i]!=null) pq.offer(lists[i]);
        }
        while(!pq.isEmpty()){
            ListNode temp=pq.poll();
            dummy.next=temp;
            if(temp.next!=null){
                pq.offer(temp.next);
            }
            dummy=dummy.next;
        }
        return ans.next;
    }
}