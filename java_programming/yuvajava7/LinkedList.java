public class LinkedList {
    node head;


    LinkedList() {
        head = null;
    }
    public void add(int data){
        node newnode = new node(data);
        newnode.next = head;
        head = newnode;
    }
}