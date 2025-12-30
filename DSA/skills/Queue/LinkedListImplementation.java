package DSA.skills.Queue;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}

class queueLL{
    Node head = null;
    Node tail = null;
    int size = 0;

    public void add(int val){
        Node temp = new Node(val);
        if(size == 0){
            head = tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public int reomve(){
        if(size == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int peek(){
        if(size == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        return head.data;
    }

    public void display(){
        if(size == 0){
            System.out.println("Queue is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class LinkedListImplementation {
    public static void main(String[] args) {
        queueLL ql = new queueLL();
        ql.add(10);
        ql.add(20);
        ql.add(30);
        ql.display();
        System.out.println(ql.peek());
        ql.reomve();
        ql.display();
        ql.add(10);
        ql.display();
    }
}
