package CDC_Placement;

public class Reverse_String {
    public static void main(String[] args) {
        String s="Reva University";
        char ch[]=s.toCharArray();
        char result[]=new char[ch.length];
        int n=result.length-1;
        for(int i=0;i<=n;i++){
            result[i]=ch[n-i];
        }
        for(char a: result){
            System.out.print(a);
        }
        System.out.println();

        //method two inplace change using two pointers
        int i=0;
        int j=ch.length-1;
        while(i<j){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        for(char b:ch){
            System.out.print(b);
        }
    }
}
