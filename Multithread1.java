
import java.util.*;
class Even implements Runnable{
    Queue <Integer>sharedListObject;
    Even(Queue<Integer>sharedListObject){
        this.sharedListObject=sharedListObject;
    }
    public void run(){
        while(true){
            synchronized(sharedListObject){
                while(sharedListObject.size()<1 || sharedListObject.element()%2!=0){
                    try{
                        sharedListObject.wait();
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
                int val = sharedListObject.remove();
                System.out.println("square :"+val*val);
                sharedListObject.notifyAll();
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
class Odd implements Runnable{
    Queue <Integer>sharedListObject;
    Odd(Queue<Integer>sharedListObject){
        this.sharedListObject=sharedListObject;
    }
    public void run(){
        while(true){
            synchronized(sharedListObject){
                while(sharedListObject.size()<1 || sharedListObject.element()%2==0){
                    try{
                        sharedListObject.wait();
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
                int val = sharedListObject.remove();
                System.out.println("Cube :"+val*val*val);
                sharedListObject.notifyAll();
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
class Number implements Runnable{
    Queue <Integer>sharedListObject;
    Number(Queue<Integer>sharedListObject){
        this.sharedListObject=sharedListObject;
    }
    public void run(){
        while(true){
            synchronized(sharedListObject){
                while(sharedListObject.size()>=1){
                    try{
                        sharedListObject.wait();
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
                Random r = new Random();
                int randomNum = r.nextInt(1000);
                System.out.println(Thread.currentThread().getName()+" "+"Random number : " + randomNum);
                sharedListObject.add(randomNum);
                sharedListObject.notifyAll();
                try{
                    Thread.sleep(5000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
           
   
        }
    }
}
public class Multithread1 {
    public static void main(String[] args){
        Queue <Integer> sharedListObject = new LinkedList<Integer>();
        Thread random = new Thread(new Number(sharedListObject),"Random thread");
        Thread even = new Thread(new Even(sharedListObject),"Odd thread");
        Thread odd= new Thread(new Odd(sharedListObject),"Even thread");
        
        random.start();
        odd.start();
        even.start();
    }
}