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
    public ListNode[] splitListToParts(ListNode head, int k){
        ListNode []ans=new ListNode[k];
        if(head==null){
            return ans;
        }
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        int d=len/k;
        int r=len%k;
        len=0;
        while(head!=null){
            ListNode curr=new ListNode(3162);
            ListNode hold=curr;
            for(int i=0;i<d;i++){
                curr.next=head;
                head=head.next;
                curr=curr.next;
            }
            if(r>0){
                if(curr.next==null){
                    curr.next=head;
                    head=head.next;
                    curr=curr.next;
                }
                else{
                    curr.next=head;
                    head=head.next;
                    curr=curr.next;
                }
                r--;
            }
            curr.next=null;
            ans[len++]=hold.next;
        }
        return ans;
    }
}