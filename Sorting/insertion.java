package Sorting;
class insertion{
    public int [] sort(int arr[]){
        int n=arr.length-1;
        //we assume first element is already sorted, so start from 1
        for(int i=1;i<=n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>=key){
                arr[j+1]=arr[j];
                j-=1;
            }
            arr[j+1]=key;
        }
        return arr;
    }
    public static void main(String[] args) {
        insertion obj=new insertion();
        int [] arr={2,4,5,6,7,3};
        arr=obj.sort(arr);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}