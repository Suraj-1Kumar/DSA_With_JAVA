package DSA.skills.Queue;

class Dqueue{
    int front;
    int rear;
    int size;
    int capacity;
    int[] arr;

    public Dqueue(int cap){
        this.capacity = cap;
        this.arr = new int[capacity];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }

    public void insertFront(int val) throws Exception{
        if(size == capacity){
            throw new Exception("Deque is full");
        }
        if(size == 0){
            front = rear = 0;
        }
        else if(front == 0){
            front = capacity - 1;
        }
        else{
            front--;
        }
        arr[front] = val;
        size++;
    }

    public void insertRear(int val) throws Exception{
        if(size == capacity){
            throw new Exception("Deque is full");
        }
        if(size == 0){
            front = rear = 0;
        }
        else if(rear == capacity - 1){
            rear = 0;
        }
        else{
            rear++;
        }
        arr[rear] = val;
        size++;
    }

    public int removeFront() throws Exception{
        if(size == 0){
            throw new Exception("Deque is empty");
        }
        int val = arr[front];
        if(front == rear){
            front = rear = -1;
        }
        else if(front == capacity - 1){
            front = 0;
        }
        else{
            front++;
        }
        size--;
        return val;
    }

    public int removeRear() throws Exception{
        if(size == 0){
            throw new Exception("Deque is empty");
        }
        int val = arr[rear];
        if(front == rear){
            front = rear = -1;
        }
        else if(rear == 0){
            rear = capacity - 1;
        }
        else{
            rear--;
        }
        size--;
        return val;
    }

    public void display() throws Exception{
        if(size == 0){
            throw new Exception("Deque is empty");
        }
        int i = front;
        while(true){
            System.out.print(arr[i] + " ");
            if(i == rear) break;
            i = (i + 1) % capacity;
        }
        System.out.println();
    }
}

public class dqueueDemo {
    public static void main(String[] args) {
        Dqueue dq = new Dqueue(5);
        try {
            dq.insertFront(10);
            dq.insertRear(20);
            dq.insertFront(5);
            dq.insertRear(25);
            dq.display(); // Expected: 5 10 20 25

            System.out.println("Removed from front: " + dq.removeFront()); // Expected: 5
            System.out.println("Removed from rear: " + dq.removeRear());   // Expected: 25
            dq.display(); // Expected: 10 20

            dq.insertRear(30);
            dq.insertFront(2);
            dq.display(); // Expected: 2 10 20 30

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
