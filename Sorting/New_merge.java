package Sorting;

import java.util.Arrays;

public class New_merge {
    public static void merge(int arr[], int l, int m, int r){
        int n1=(m-l)+1;
        int n2=r-m;
        int l1[]=new int[n1];
        int l2[]=new int[n2];

        for(int i=0;i<n1;i++){
            l1[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++){
            l2[j]=arr[m+j+1];
        }

        int i=0,j=0;
        int k=l;
        while(i<n1 && j<n2){
            if(l1[i]<l2[j]){
                arr[k]=l1[i];
                i++;
            }else if(l2[j]<l1[i]){
                arr[k]=l2[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=l1[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=l2[j];
            j++;
            k++;
        }
    }
    public static void sort(int arr[],int l,int r){
        if(l<r){
            int m=l+(r-l)/2;
            sort(arr,l,m);
            sort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }
    public static void main(String[] args) {
        int a[]={3,2,6,5,1};
        sort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
