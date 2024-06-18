package Threading;
import java.lang.Thread;

class multiDemo extends Thread{
    public void run(){
        System.out.println("Thread"+Thread.currentThread().threadId());
    }
}
public class prg1{
    public static void main(String[] args) {
        int n=8;
        for(int i=0;i<n;i++){
            multiDemo obj=new multiDemo();
            obj.start();
        }
    }
}
