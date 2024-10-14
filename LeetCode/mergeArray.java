package LeetCode;

public class mergeArray {
    public int[] mapArr(int n,int m,int a[],int b[]){
        int [] result=new int[m+n];
        int i=0;
        int j=0;
        int idx=0;
        while(i<n && j<m){
            if(a[i]<b[j]){
                result[idx]=a[i];
                i++;
                idx++;
            }
            else{
                result[idx]=b[j];
                j++;
                idx++;
            }
        }
        if(i<n){
            while(i<n){
                result[idx]=a[i];
                idx++;
                i++;
            }
        }
        if(j<m){
            while(j<m){
                result[idx]=b[j];
                idx++;
                j++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        mergeArray obj=new mergeArray();
        int a1[]={3,6,8,10};
        int b1[]={1,2,4,7,9,12,14};
        int result[]=obj.mapArr(a1.length, b1.length, a1, b1);
        for(int i:result){
            System.out.print(i+ " ");
        }
    }
}
