public class rotArry {
    static int[] rotGiven(int []nums, int k){
        while(k>0){
            int first=nums[0];
            for(int i=0;i<nums.length-1;i++){
                nums[i]=nums[i+1];
            }
            nums[nums.length-1]=first;
            k--;
        }
        return nums;
    }
    public static void main(String[] args){
       int a[]={1,2,3,4,5,6,7};
       a=rotGiven(a, 3);
       for(int i:a){
        System.out.println(i);
       }
    }
}
