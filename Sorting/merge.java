package Sorting;

public class merge {
    public void sort(int arr[],int l,int r){
        if(l<r){
            int m=(l+r)/2;
            sort(arr,l,m);
            sort(arr,m+1,r);
            Merge(arr,l,m,r);
        }
    }
    public void Merge(int arr[],int l,int m,int r){
        int n1=(m-l)+1;
        int n2=(r-m);
        int L[]=new int[n1];
        int R[]=new int[n2];
        for(int i=0;i<n1;i++){
            L[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++){
            R[j]=arr[m+j+1];
        }
        int k=l;
        int i=0,j=0;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k]=L[i];
                i++;
                k++;
            }else{
                arr[k]=R[j];
                j++;
                k++;
            }
        }
        while(i<n1){
            arr[k]=L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=R[j];
            j++;
            k++;
        }
    }
    public void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={13,2,5,2,6,10};
        merge obj=new merge();
        obj.sort(arr,0,arr.length-1);
        obj.printArray(arr);
    }
}
