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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode temp=null;
        ListNode ans=null;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                if(temp==null){
                    temp=list1;
                    ans=temp;
                }
                else{
                    temp.next=list1;
                    temp=temp.next;
                }
                list1=list1.next;
            }
            else{
                if(temp==null){
                    temp=list2;
                    ans=temp;
                }
                else{
                    temp.next=list2;
                    temp=temp.next;
                }
                list2=list2.next;
            }
        }
        while(list1!=null){
            temp.next=list1;
            list1=list1.next;
            temp=temp.next;
        }
        while(list2!=null){
            temp.next=list2;
            list2=list2.next;
            temp=temp.next;
        }
        return ans;
    }
}