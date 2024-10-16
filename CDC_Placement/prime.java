package CDC_Placement;
import java.util.*;
public class prime {
    public void isPrime(int n){
        if (n>1){
            for(int i=2;i<n/2;i++){
                if(n%i==0){
                    System.out.println("Number "+n+" is not a prime number");
                    System.exit(0);
                }
            }
            System.out.print("Number "+n+" is a prime number");
        }else{
            System.out.println("Number is not a prime number");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        prime obj=new prime();
        obj.isPrime(n);
        sc.close();
    }
}
