package CDC_Placement;
import java.util.*;
public class armstrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:" );
        String s=sc.next();
        int l=s.length();
        int n=Integer.parseInt(s);
        int temp=n;
        double sum=0;
        for(int i=0;i<l;i++){
            int rem=n%10;
            sum=sum+(Math.pow(rem,l));
            n=n/10;
        }
        if(temp==sum){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not an Armstrong");
        }
        sc.close();
    }
}
