package Sorting;

public class bubble {
    public int[] sort(int arr[]){
        int n=arr.length-1;
        for(int i=0;i<n-1;i++){
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
    public static void main(String[] args){
        bubble obj=new bubble();
        int [] arr={2,4,5,6,7,3};
        arr=obj.sort(arr);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
