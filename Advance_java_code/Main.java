import java.util.*;

class MyThread implements Runnable{
    public void run(){
        System.out.println("Thread is running with name: "+Thread.currentThread().getId());
    }
}

public class Main {
    public static void main(String[] args) {
        int i = 0;
        while(i<5){
            Thread thread = new Thread(new MyThread());
            thread.start();
            i++;
        }
    }
}
