package Queue;
import java.util.*;
public class generateBin {
    public String[] generateBinaryDigit(int n){
        String [] result=new String[n];
        Queue<String> queue=new LinkedList<>();
        queue.offer("1");
        for(int i=0;i<n;i++){
            result[i]=queue.poll();
            String n1=result[i]+"0";
            String n2=result[i]+"1";
            queue.offer(n1);
            queue.offer(n2);
        }
        return result;
    }
    public static void main(String[] args) {
        generateBin obj=new generateBin();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value to generate the binary output: ");
        int n=sc.nextInt();
        String []res=obj.generateBinaryDigit(n);
        for(String c: res){
            System.out.print(c+", ");
        }
        System.out.println("Done");
        sc.close();
    }
}
