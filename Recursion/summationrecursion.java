package Recursion;

public class summationrecursion {
    int sum=0;
    int fact=1;
    public int sum_of_n(int n){
        if(n==0) return 0;
        return sum+=n+sum_of_n(n-1);
    }
    public void sum_of_n(int i,int n){
        if(i==0){
            System.out.println(n);
            return; //return is very important to terminate
        }
        sum_of_n(i-1, n+i);
    }
    public void factorial(int i,int n){
        if(i==1){
            System.out.println(n);
            return; //return is very important to terminate
        }
        factorial(i-1, n*i);
    }
    public int factorial(int n){
        if(n==0) return 1;
        return fact*=n*factorial(n-1); //re-initialization is very important to update value when it is not parameterized type recursion
    }
    public static void main(String[] args) {
        summationrecursion obj=new summationrecursion();
        int result=obj.sum_of_n(5);
        System.out.println(result);
        obj.sum_of_n(5,0);
        obj.factorial(5,1);
        int result_facct=obj.factorial(5);
        System.out.println(result_facct);
    }
}
