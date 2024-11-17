package Sorting;

public class selection {
    public int[] sort(int arr[]){
        int n=arr.length-1;
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
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
        selection obj=new selection();
        int arr[]={4,2,5,6,3,7};
        arr=obj.sort(arr);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
