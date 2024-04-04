public class sqrt {
    public static void main(String[] args) {
        int n=36;
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=i;
        }
        int low=0;
        int high=a.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]*a[mid]==n){
                System.out.println(a[mid]);
                System.exit(0);
            }
            if (a[mid]*a[mid]<n) {
                low=mid;
            }else{
                high=mid;
            }
        }
    }
}
//time complexity:O(lon(n))