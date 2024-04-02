public class mergeSort {
    public static void main(String[] args) {
        int arr1[]={3,5,7,9};
        int arr2[]={1,4,6,8};
        int count=0;
        int result[]=new int[arr1.length+arr2.length];
        // for(int i=0,j=0;i<Math.min(arr1.length,arr2.length);i++){
        //     if(arr1[i]<arr2[j]){
        //         result[count]=arr1[i];
        //         count++;
        //     }else{
        //         result[count]=arr2[j];
        //         j++;
        //         count++;
        //     }
        // }
        int i=0,j=0,k=0,l=0;
        while(k<arr1.length && l<arr2.length){
            if(arr1[i]<arr2[j]){
                result[k]=arr1[i];
                k++;
                i++;
            }else{
                result[k]=arr2[j];
                l++;
                j++;
            }
        }
        for(int a:result){
            System.out.println(a);
        }
    }
}
