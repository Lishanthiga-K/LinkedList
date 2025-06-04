class Main{
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
    public void remove(int data){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        Node current = head;
        while(current != null){
            if(current.data == data){
                prev.next = current.next;
                head = dummy.next;
                return;
            }
            prev = current;
            current = current.next;
        }
        System.out.println("Value not found");
    }
    public void iterate(){
        Node headNode = head;
        while(headNode!=null){
            System.out.print(headNode.data + " -> ");
            headNode = headNode.next;
        }
        System.out.println("Null");
    }
    
    public static void main(String[] args){
        Main list = new Main();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.iterate();
        list.remove(20);
        list.iterate();
    }
}
