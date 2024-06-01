package stack;

public class leet28 {
    public static void main(String[] args) {
        String a="I am Sanop";
        String target="Sanoop";
        int i=0;
        int j=0;
        int result=-1;
        while(i<a.length() && j<target.length()){
            char first=a.charAt(i);
            char second=target.charAt(j);
            if(first==second){
                i++;
                j++;
                if(j==target.length()){
                    System.out.println(i-j);
                    System.exit(0);
                }
            }else{
                i=i-j+1;
                j=0;
            }
        }
        System.out.println(-1);
    }
}
