package DSA.skills.Queue;

class queueA{
    int f = -1;
    int r = -1;
    int size = 0;
    int[] arr = new int[100];

    public void add(int val){
        if(size == arr.length-1){
            System.out.println("Queue is full");
            return;
        }

        if(f == -1){
            f = r = 0;
            arr[r] = val;
        } 
        else{
            r++;
            arr[r] = val;
            
        }
        size++;
    }

    public int remove(){
        if(size == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        int val = arr[f];
        f++;
        size--;
        return val;
    }

    public int peek(){
        if(size == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[f];
    }

    public void display(){
        if(size == 0){
            System.out.println("Queue is empty");
            return;
        }
        for(int i=f; i<=r; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
public class ArrayImplement {
    public static void main(String[] args) {
        queueA q = new queueA();
        q.add(10);
        q.add(20);
        q.add(30);
       
        q.display();
        System.out.println(q.peek());
        q.remove();
        q.display();
        q.add(10);
        q.display();
    }
}
