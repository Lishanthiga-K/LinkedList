class LinkedList{
    private Node head;
    private static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node headNode = head;
        while(headNode.next != null){
            headNode = headNode.next;
        }
        headNode.next = newNode;
    }
   
    public void iterate(){
        Node headNode = head;
        while(headNode!=null){
            System.out.print(headNode.data + " -> ");
            headNode = headNode.next;
        }
        System.out.println("Null");
    }
  public Node revGroups(Node head,int n){
        Node current=head,prev=null,next=null;
        int count=0;
        while(current!=null && count<n){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
            count++;
        }
        if(next!=null){
            head.next=revGroups(next,n);
            
        }
        return prev;
        
    }
    public void ReverseInGroups(int n){
        head=revGroups(head,n);
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.iterate();
        list.ReverseInGroups(3);
    }
}
