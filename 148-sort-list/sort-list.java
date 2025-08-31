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
    ListNode Middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    ListNode Merge(ListNode low,ListNode high){
        ListNode temp=null,ans=null;
        while(low!=null && high!=null){
            if(low.val<high.val){
                if(temp==null){
                    temp=low;
                    ans=temp;
                }
                else{
                    temp.next=low;
                    temp=temp.next;
                }
                low=low.next;
            }else{
                if(temp==null){
                    temp=high;
                    ans=temp;
                }
                else{
                    temp.next=high;
                    temp=temp.next;
                }
                high=high.next;
            }  
        }
        while(low!=null){
            temp.next=low;
            temp=temp.next;
            low=low.next;
        }
        while(high!=null){
            temp.next=high;
            temp=temp.next;
            high=high.next;
        }
        return ans;
    }
    public ListNode sortList(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid=Middle(head);
        ListNode right=mid.next;
        mid.next=null;
        ListNode left=head;
        ListNode node1=sortList(left);
        ListNode node2=sortList(right);
        return Merge(node1,node2);
    }
}