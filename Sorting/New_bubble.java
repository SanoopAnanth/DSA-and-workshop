package Sorting;

import java.util.Arrays;

public class New_bubble {
    public int [] bubble_sort(int [] arr){
        int n=arr.length-1;
        for(int i=0;i<=n;i++){
            for(int j=0;j<n-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int a[]={3,2,6,5,1};
        New_bubble obj=new New_bubble();
        int result[]=obj.bubble_sort(a);
        System.out.println(Arrays.toString(result));
    }
}
