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
    public ListNode sortList(ListNode head){
        int low=0;
        int high=0;
        ListNode temp=head;
        while(temp!=null){
            high++;
            temp=temp.next;
        }
        high--;
        return mergesort(head,low,high);
    }
    ListNode mergesort(ListNode head,int low,int high){
        if(low>=high) return head;
        ListNode temp=head;
        ListNode left=temp;
        int mid=low+(high-low)/2;
        for(int i=0;i<mid-low;i++){
            temp=temp.next;
        }
        ListNode right=temp.next;
        temp.next=null;
        ListNode n1=mergesort(left,low,mid);
        ListNode n2=mergesort(right,mid+1,high);
        return merge(n1,n2);
    }
    ListNode merge(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(3162);
        ListNode ans=dummy;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                ans.next=l1;
                l1=l1.next;
            }
            else{
                ans.next=l2;
                l2=l2.next;
            }
            ans=ans.next;
        }
        while(l1!=null){
            ans.next=l1;
            ans=ans.next;
            l1=l1.next;
        }
        while(l2!=null){
            ans.next=l2;
            l2=l2.next;
            ans=ans.next;
        }
        return dummy.next;
    }
}