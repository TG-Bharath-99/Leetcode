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
    public int[] nextLargerNodes(ListNode head){
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        int []ans=new int[len];
        int []lis=new int[len];
        len=0;
        temp=head;
        while(temp!=null){
            lis[len++]=temp.val;
            temp=temp.next;
        }
        len=0;
        Stack<Integer>ms=new Stack<>();
        while(head!=null){
            while(!ms.isEmpty() && head.val>lis[ms.peek()]){
                ans[ms.pop()]=head.val;
            }
            ms.push(len++);
            head=head.next;
        }
        return ans;
    }
}