package LinkedList;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}

class LinkedList{
    Node head;
    
    public LinkedList(){
        head = null;
        return;
    }

    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
public class BasicSLL {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(5);
        ll.insert(10);
        ll.insert(15);
        ll.insert(20);
        ll.insert(25);

        ll.display();
    } 
}
