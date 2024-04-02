public class rotArry {
    public static void main(String[] args){
        int arr[]={4,5,1,2,3};
        int target=2;
        int ele=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Target found in index:"+i);
            }
        }
    }
}
