public class twosum {
public static void main(String[] args) {
    int []a={1,2,4,5,8,10,12};
    int i=0;
    int j=a.length-1;
    int result=15;
    while(i<j){
        int sum=a[i]+a[j];
        if(sum==result){
            System.out.println("Solution exist");
        }
        if(sum>result){
            j--;
        }else{
            i++;
        }
    }
}
}
