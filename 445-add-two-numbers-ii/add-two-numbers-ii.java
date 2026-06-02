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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode dummy=null;
        Stack<Integer>s1=new Stack<>();
        Stack<Integer>s2=new Stack<>();
        ListNode temp=l1;
        while(temp!=null){
            s1.push(temp.val);
            temp=temp.next;
        }
        temp=l2;
        while(temp!=null){
            s2.push(temp.val);
            temp=temp.next;
        }
        int carry=0;
        while(!s1.isEmpty() && !s2.isEmpty()){
            int sum=s1.pop()+s2.pop()+carry;
            int r=sum%10;
            temp=new ListNode(r);
            if(dummy==null){
                dummy=temp;
            }
            else{
                temp.next=dummy;
                dummy=temp;
            }
            carry=sum/10;
        }
        while(!s1.isEmpty()){
            int sum=s1.pop()+carry;
            int r=sum%10;
            temp=new ListNode(r);
            if(dummy==null){
                dummy=temp;
            }
            else{
                temp.next=dummy;
                dummy=temp;
            }
            carry=sum/10;
        }
        while(!s2.isEmpty()){
            int sum=s2.pop()+carry;
            int r=sum%10;
            temp=new ListNode(r);
            if(dummy==null){
                dummy=temp;
            }
            else{
                temp.next=dummy;
                dummy=temp;
            }
            carry=sum/10;
        }
        if(carry!=0){
            temp=new ListNode(carry);
            temp.next=dummy;
            dummy=temp;
        }
        return dummy;
    }
}