package LeetCode;

public class mergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int result[]=new int[m+n];
        int i=0;
        int j=0;
        int count=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                result[count]=nums1[i];
                i++;
            }else{
                result[count]=nums2[j];
                j++;
            }
            count++;
        }
        if(j<n){
            result[count]=nums2[j];
            j++;
            count++;
        }
        if(i<m){
            result[count]=nums1[i];
            i++;
            count++;
        }
        for(int k:result){
            System.out.print(k+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        mergeSortedArray ob=new mergeSortedArray();
        int nums1[]={1,2,3,0,0,0};
        int nums2[]={2,5,6};
        ob.merge(nums1, 3, nums2, 3);
    }
}
