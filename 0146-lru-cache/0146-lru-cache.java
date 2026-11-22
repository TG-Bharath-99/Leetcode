class Node{
    int key;
    int data;
    Node prev;
    Node next;
    Node(int key,int data){
        this.key=key;
        this.data=data;
    }
}
class LRUCache {
    Map<Integer,Node>map;
    int size=0;
    Node head;
    Node tail;
    Node temp;
    public LRUCache(int capacity) {
        map=new HashMap<>();
        size=capacity;
        head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
        temp=head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node x=map.get(key);
            x.prev.next=x.next;
            x.next.prev=x.prev;
            x.next=head.next;
            x.prev=head;
            head.next.prev=x;
            head.next=x;
            return x.data;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(size==0) return;
        if(map.containsKey(key)){
            Node x=map.get(key);
            x.data=value;
            x.prev.next=x.next;
            x.next.prev=x.prev;
            x.next=head.next;
            x.prev=head;
            head.next.prev=x;
            head.next=x;
            }
        else{
            if(map.size()==size){
                Node rem=tail.prev;
                rem.prev.next=rem.next;
                rem.next.prev=rem.prev;
                map.remove(rem.key);
            }
                Node node=new Node(key,value);
                map.put(key,node);
                Node rem=temp;
                node.next=head.next;
                node.prev=head;
                head.next=node;
                node.next.prev=node;
            }
        }
    }


/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */