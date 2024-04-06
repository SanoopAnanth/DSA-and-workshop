package stack;
import java.util.*;
public class leet150 {
    public static void main(String[] args) {
        String []tokens={"2","1","+","3","*"};
        int result=evalRPN(tokens);
        System.out.println(result);
    }
    public static int evalRPN(String[] tokens){
        Stack<String> stack=new Stack<>();
        for(int i=tokens.length-1;i>0;i--){
            stack.push(tokens[i]);
        }
            while(stack.size()>1){
                int ele1=Integer.parseInt(stack.pop());
                int ele2=Integer.parseInt(stack.pop());
                String op=stack.pop();
                int result=0;
                switch (op) {
                    case "+":
                        result=ele2+ele1;
                        stack.push(Integer.toString(result));
                        break;
                    case "-":
                        result=ele2-ele1;
                        stack.push(Integer.toString(result));
                        break;
                    case "*":
                        result=ele2*ele1;
                        stack.push(Integer.toString(result));
                        break;
                    case "/":
                        result=ele2/ele1;
                        stack.push(Integer.toString(result));
                        break;
                    default:
                        break;
                }
            }
        int op=Integer.parseInt(stack.pop());
        return op;
    }
}
// class Solution {
//     public int evalRPN(String[] tokens) {
//         Stack<Integer> stack = new Stack<Integer>();

//     for (String token : tokens) {
//       if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
//         var ele1 = stack.pop();
//         var ele2 = stack.pop();

//         if (token.equals("+"))
//           stack.push(ele2 + ele1);
//         else if (token.equals("-"))
//           stack.push(ele2 - ele1);
//         else if (token.equals("*"))
//           stack.push(ele2 * ele1);
//         else if (token.equals("/"))
//           stack.push(ele2 / ele1);
//       } else
//         stack.push(Integer.parseInt(token));
//     }
//     return stack.pop();
//     }
// }
