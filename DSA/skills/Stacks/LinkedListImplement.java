package DSA.skills.Stacks;


class Node{
    int val;
    Node next;

    public Node(int val){
        this.val = val;
    }
}

class StackLL{
    private Node head = null;
    private int size = 0;

    void push(int val){
        Node temp = new Node(val);

        temp.next = head;
        head = temp;
        size++;
    }

    int peek(){
        if(head == null) {
            System.out.println("Stack is empty!");
            return -1;
        }    

        return head.val;
    }

    int pop(){
        if(head == null){
            System.out.println("Stack is empty!");
            return -1;
        }

        int top = head.val;
        head = head.next;
        size--;

        return top;
    }

    boolean isEmpty(){
        if(head == null) return true;
        else return false;
    }

    int size(){
        return size;
    }

    void displayRec(Node node){
        if(node == null) return;
        displayRec(node.next);
        System.out.print(node.val + " ");
    }

    void display(){
        if(head == null){
            System.out.println("Stack is empty!");
            return;
        }
        displayRec(head);
        System.out.println();
    }
}

public class LinkedListImplement {
    public static void main(String[] args) {
        StackLL stl = new StackLL();

        stl.push(10);
        stl.push(20);
        stl.push(30);
        stl.push(40);

        stl.display();
        System.out.println(stl.size());

        System.out.println(stl.peek());

        System.out.println(stl.pop());

        stl.display();
        System.out.println(stl.size());
    }
}
