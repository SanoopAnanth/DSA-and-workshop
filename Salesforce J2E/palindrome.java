public class palindrome {
    public static void main(String[] args) {
        char []mychar={'a','m','r','r','m','a'};
        int i=0;
        int j=mychar.length-1;
        while(i<j){
            if(mychar[i]==mychar[j]){
                i++;
                j--;
            }else{
                System.out.println("Not a palindrome");
                System.exit(0);
            }
        }
        System.out.println("Palindrome");
    }
}
