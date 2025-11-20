public class QueueDemo {
    int[] queue = new int[5];
    int size;
    int front;
    int rear;

    public void enQueue(int data){
        if(!isFull()){
            queue[rear] = data;
            rear = (rear + 1) % 5;
            size++;
        }
    }

    public int deQueue(){
        int data = queue[front];

        if(!isEmpty()){
            front = (front + 1) % 5;
            size--;
        }
        return data;
    }

    public boolean isFull(){
        return getSize() == 5;
    }

    public boolean isEmpty(){
        return getSize() == 0;
    }

    public int getSize(){
        return size;
    }

    public void show(){
        for(int i = 0; i < size; i++){
            System.out.print(queue[(front + i) % 5] + " ");
        }
    }

    public static void main(String[] args) {
        QueueDemo q = new QueueDemo();
        q.enQueue(5);
        q.enQueue(7);
        q.enQueue(1);

        q.show();

        System.out.println();
        q.deQueue();
        q.deQueue();
        q.show();

        System.out.println();
        q.enQueue(3);
        q.enQueue(9);
        q.show();
    }
}
