package DSA.skills.Queue;

class Cqueue{
    int f = -1;
    int r = -1;
    int size = 0;
    int[] arr = new int[5];

    public void add(int val) throws Exception{
        if(size == arr.length){
            throw new Exception("Queue is full");
        }

        else if(size == 0){
            f = r = 0;
            arr[r] = val;
        }

        else if(r == arr.length - 1){
            r = 0;
            arr[r] = val;
        }
        else if(r < arr.length - 1){
            r++;
            arr[r] = val;
        }
        size++;
    }

    public int remove() throws Exception{
        if(size == 0){
            throw new Exception("Queue is empty");
        }
        else{
            int val = arr[f];
            if(f == arr.length-1) f = 0;
            else f++;
            size--;
            return val;
        }    
    }

    public int peek() throws Exception{
        if(size == 0){
            throw new Exception("Queue is empty");
        }
        else{
            return arr[f];
        }
    }

    public void display() throws Exception{
        if(size == 0){
            throw new Exception("Queue is empty");
        }

        else if(f <= r){
            for(int i = f; i <= r; i++){
                System.out.print(arr[i] + " ");
            }
        }
        else { // r < f
            for(int i = f; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            for(int i = 0; i <= r; i++){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}

public class CqueueArray {
    public static void main(String[] args) throws Exception {
        Cqueue cq = new Cqueue();
        cq.add(10);
        cq.add(20);
        cq.add(30);
        cq.add(40);
        cq.add(50);
        cq.display();
        System.out.println(cq.peek());
        cq.remove();
        cq.display();
        cq.add(60);
        cq.display();

    }
}
