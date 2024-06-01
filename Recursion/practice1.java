package Recursion;

public class practice1 {
    public void n_to_1(int i,int n){
        if(i==n+1) return;
        n_to_1(i+1,n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        practice1 obj=new practice1();
        obj.n_to_1(1,3);
    }
}
