/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution{
    public Node flatten(Node head){
        if(head==null){
            return null;
        }
        if(head.child==null){
            head.next=flatten(head.next);
            if(head.next!=null){
                head.next.prev=head;
            }
        }
        else{
            Node next=head.next;
            head.next=flatten(head.child);
            head.next.prev=head;
            head.child=null;
            Node tail=head.next;
            while(tail.next!=null){
                tail=tail.next;
            }
            tail.next=flatten(next);
            if(tail.next!=null){
                tail.next.prev=tail;
            }
        }
        return head;
    }
}