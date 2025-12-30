//import java.util.*;

/*class AB implements Runnable{
    public void run(){
        for(int i = 1; i <= 10; i++){
            System.out.println("Hii");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class BA implements Runnable{
    public void run(){
        for(int i = 1; i <= 10; i++){
            System.out.println("Hello");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class A extends Thread{
    public void run(){
        for(int i = 1; i <= 10; i++){
            System.out.println("Hii");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i = 1; i <= 10; i++){
            System.out.println("Hello");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
*/

public class ThreadDemo {
    public static void main(String[] args){
        /*A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        try{
            Thread.sleep(10);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        obj2.start(); 

        Runnable obj3 = new AB();
        Runnable obj4 = new BA();  */

        Runnable obj5 = () ->
        {
            for(int i = 1; i <= 10; i++){
                System.out.println("Hii");
                try{
                    Thread.sleep(10);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }    
            }
        };

        Runnable obj6 = () ->
        {
            for(int i = 1; i <= 10; i++){
                System.out.println("Hello");
                try{
                    Thread.sleep(10);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }    
            }
        };
        
        Thread t1 = new Thread(obj5);
        Thread t2 = new Thread(obj6);

        t1.start();
        t2.start();
    }
}
