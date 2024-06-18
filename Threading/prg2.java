package Threading;

class multiDemo implements Runnable{
    public void run(){
        System.out.println("Thread"+Thread.currentThread().threadId());
    }
}

public class prg2 {
    public static void main(String[] args) {
        int n=8;
    for(int i=0;i<n;i++){
        Thread obj=new Thread(new multiDemo());
        obj.start();
    }
    }
}
