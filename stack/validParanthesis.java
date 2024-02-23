package stack;

import java.util.Stack;

public class validParanthesis {
    public boolean checkPara(String s){
        Stack <Character> stack=new Stack<>();
        char arr[]=s.toCharArray();
        for(char c :arr){
            if(c =='(' ||c=='{'||c=='['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else{
                char top=stack.peek();
                if(top=='{' && c=='}' ||
                top=='(' && c==')' ||
                top=='[' && c==']'){
                    stack.pop();
                }else{
                    return false;
                }
            }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        validParanthesis obj=new validParanthesis();
        String s=new String("[{}]");
        if(obj.checkPara(s)){
            System.out.println("Valid string");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
