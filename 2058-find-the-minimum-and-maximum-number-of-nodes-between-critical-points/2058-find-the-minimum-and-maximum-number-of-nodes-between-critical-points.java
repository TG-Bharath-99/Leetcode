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
    public int[] nodesBetweenCriticalPoints(ListNode head){
        int n1=-1,n2=-1,n3=-1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int idx=2;
        int count=0;
        ListNode prev=head;
        ListNode temp=prev.next;
        while(temp!=null && temp.next!=null){
            if((temp.val>prev.val && temp.val>temp.next.val) || (temp.val<prev.val && temp.val<temp.next.val)){
                if(n1==-1){
                    n1=idx;
                }else if(n2==-1){
                    n2=idx;
                    min=Math.min(min,n2-n1);
                }
                else if(n3==-1){
                    n3=idx;
                    min=Math.min(min,Math.min(n3-n2,n2-n1));
                }
                else{
                    n2=n3;
                    n3=idx;
                    min=Math.min(min,Math.min(n3-n2,n2-n1));
                }
                count++;
            }
            idx++;
            prev=temp;
            temp=temp.next;
        }
        int []ans=new int[2];
        if(count<2){
            return new int[]{-1,-1};
        }
        if(count==2){
            return new int[]{min,n2-n1};
        }
        return new int[]{min,n3-n1};
    }
}