package Sorting;
import java.util.*;
import java.lang.*;
public class New_Selection {
    public int [] select_sort(int [] arr){
        int n=arr.length-1;
        int min_index;
        for(int i=0;i<n-1;i++){
            min_index=i;
            for(int j=i+1;j<=n;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int a[]={3,2,6,5,1};
        New_Selection obj=new New_Selection();
        int result[]=obj.select_sort(a);
        System.out.println(Arrays.toString(result));
    }
}
