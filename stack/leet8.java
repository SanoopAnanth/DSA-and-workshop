// package stack;
// public class leet8{
//     public static void main(String[] args) {
//         String s="  48";
//         int result=getNumber(s);
//         System.out.println(result);
//     }
//     public static int getNumber(String s){
//         char ch[]=s.toCharArray();
//         int result=0;
//         for(int i=0;i<ch.length;i++){
//             if(ch[i]!=' '){
//                 if(ch[i]=='-'){
//                     while(ch[i+1]!=0){
//                         i++;
//                     }
//                     result*=-1;
//                 }else{
//                     if(Character.isDigit(ch[i])){
//                         int x= ch[i]-'0';
//                         x*=10;
//                         result+=x;
//                     }
//                 }
//             }
//         }
//         return result;
//     }
// }
package stack;

public class leet8 {
    public static void main(String[] args) {
        String s = "words and 987";
        int result = getNumber(s);
        System.out.println(result);
    }

    public static int getNumber(String s) {
        char ch[] = s.toCharArray();
        int result = 0;
        int sign = 1;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ' ') {
                if (ch[i] == '-') {
                    sign = -1;
                } else if (Character.isDigit(ch[i])) {
                    int x = ch[i] - '0';
                    while (i + 1 < ch.length && Character.isDigit(ch[i + 1])) {
                        i++;
                        x = x * 10 + (ch[i] - '0');
                    }
                    result=x;
                    break;
                }
            }
        }
        return result * sign;
    }
}
