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
    public void iterate(){
        Node headNode = head;
        while(headNode!=null){
            System.out.print(headNode.data + " -> ");
            headNode = headNode.next;
        }
        System.out.println("Null");
    }

    public void reverse(){
        Node prev = null;
        Node currNode = head;
        Node next = null;
        while(currNode!=null){
            next = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = next;
        }
        head = prev;
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
        list.reverse();
        list.iterate();
    }
}
