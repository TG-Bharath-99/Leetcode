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
    public int numComponents(ListNode head, int[] nums){
        Set<Integer>set=new HashSet<>();
        for(int i : nums) set.add(i);
        ListNode temp=head;
        int ans=0;
        while(temp!=null){
            int x=0;
            while(temp!=null && set.contains(temp.val)){
                x++;
                set.remove(temp.val);
                temp=temp.next;
            }
            if(x>0){
                ans++;
            }
            if(temp!=null) temp=temp.next;
        }
        return ans;
    }
}