package Recursion;

public class practice1 {
    public void n_to_1(int i,int n){
        if(i==n+1) return;
        n_to_1(i+1,n);
        System.out.println(i);
    }
    public void to_n(int j,int q){
        if (j<1) return;
        to_n(j-1,q);
        System.out.println(j);
    }
    public static void main(String[] args) {
        practice1 obj=new practice1();
        obj.n_to_1(1,3);
        obj.to_n(3,3);
    }
}
