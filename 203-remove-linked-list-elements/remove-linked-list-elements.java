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
class Solution {
    public ListNode removeElements(ListNode head, int val){
        if(head==null){
            return null;
        }
        if(head.next==null){
            if(head.val==val){
                return null;
            }
            else{
                return head;
            }
        }
        ListNode temp=null,ans=null;
        while(head!=null){
            if(head.val==val){
                head=head.next;
            }
            else{
                if(temp==null){
                    temp=head;
                    ans=temp;
                }
                else{
                    temp.next=head;
                    temp=temp.next;
                }
                head=head.next;
            }
            if(temp!=null){
                temp.next=null;
            }
        }
        return ans;
    }
}