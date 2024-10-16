package CDC_Placement;
import java.util.*;
public class fibo1 {
    public int fibo(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String[] args) {
        fibo1 obj=new fibo1();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int result=obj.fibo(n);
        System.out.println("Result is: "+result);
        sc.close();
    }
}
