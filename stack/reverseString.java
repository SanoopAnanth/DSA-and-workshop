package stack;

public class reverseString{
    public String rever(String str){
        java.util.Stack <Character> stack=new java.util.Stack<Character>();
        char[] chars=str.toCharArray();
        for(char c:chars){
            stack.push(c);
        }
        for(int i=0;i<str.length();i++){
            chars[i]=stack.pop();
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        reverseString obj=new reverseString();
        String result=obj.rever("SANOOP");
        System.out.println(result);
    }
}