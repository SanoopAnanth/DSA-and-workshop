import java.util.*;
public class sqrtBinary {
    public static double sqrtBin(int x){
        double ans=0.0;
        int left=0;
        int right=(x/2)+1;
        while(left<right){
            int mid=(left+right)/2;
            int r=mid*mid;
            if(r==x){
                ans=mid;
                break;
            }
            if(r>x){
                right=mid-1;
            }else{
                ans=mid;
                left=mid+1;
            }
        }
        double in=0.1;
        for(int i=0;i<4;i++){
            while(ans*ans<=x){
                ans+=in;
            }
            ans-=in;
            in=in/10;
        }
        return (double) ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        double result=sqrtBin(x);
        System.out.printf("%.3f",result);
        sc.close();
    }
}
