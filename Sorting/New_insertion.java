package Sorting;

import java.util.Arrays;

public class New_insertion {
    public int [] insert_sort(int [] arr){
        int n=arr.length-1;
        for(int i=1;i<=n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        return arr;
    }
    public static void main(String[] args) {
        int a[]={3,2,6,5,1};
        New_insertion obj=new New_insertion();
        int result[]=obj.insert_sort(a);
        System.out.println(Arrays.toString(result));
    }
}
