class day1{
    public static void main(String[] args) {
        // String [] weekdays={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        // for (String a:weekdays){
        //     System.out.println(a);
        // }
        int [] a={9,10,11,3,1};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        if(a.length==0){
            System.out.println("Array is empty");
            System.exit(0);
        }
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}