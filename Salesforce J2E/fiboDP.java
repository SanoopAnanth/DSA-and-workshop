import java.util.*;
import java.math.*;
public class fiboDP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BigInteger result;
        BigInteger memo[]=new BigInteger[n+1];
        long start=System.currentTimeMillis();
        memo[0]=BigInteger.ZERO;
        memo[1]=BigInteger.ONE;
        for(int i=2;i<n+1;i++){
            result=memo[i-1].add(memo[i-2]);
            memo[i]=result;
        }
        long end=System.currentTimeMillis();
        long total_time=end-start;
        System.out.println("Total_time: "+total_time);
        System.out.println(memo[n]);
        sc.close();
    }
}
