package BinaryTree;
import java.util.*;
public class prg2 {
    private TreeNode root;
    private class  TreeNode {
    TreeNode left;
    TreeNode right;
    int data;
    public TreeNode(int data){
        this.data=data;
    }
    }
    public void createTree(){
        TreeNode first=new TreeNode(1);
        TreeNode second=new TreeNode(2);
        TreeNode third=new TreeNode(3);
        TreeNode fourth=new TreeNode(4);
        TreeNode fifth=new TreeNode(5);
        root=first;
        first.left=second;
        first.right=third;
        second.left=fourth;
        second.right=fifth;
    }
    public void preOrder(){
        if(root==null){
            return;
        }
        Stack <TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp=stack.pop();
            System.out.print(temp.data+" ");
            if(temp.right!=null){
                stack.push(temp.right);
            }
            if(temp.left!=null){
                stack.push(temp.left);
            }
        }
    }
    public void inOrder(){
        if(root==null){
            return;
        }
        TreeNode temp=root;
        Stack <TreeNode> stack=new Stack<>();
        while(!stack.isEmpty() || temp!=null){
            if(temp!=null){
                stack.push(temp);
                temp=temp.left;
            }else{
                temp=stack.pop();
                System.out.print(temp.data+" ");
                temp=temp.right;
            }
        }
    }
    public void postOrder(){
        Stack <TreeNode> stack=new Stack<>();
        TreeNode current=root;
        while(current!=null || !stack.isEmpty()){
            if(current!=null){
                stack.push(current);
                current=current.left;
            }
            else{
                TreeNode temp=stack.peek().right;
                if(temp==null){
                    temp=stack.pop();
                    System.out.println(temp.data);
                    while(!stack.isEmpty() && temp==stack.peek().right){
                        temp=stack.pop();
                        System.out.println(temp.data);
                    }
                }
                else{
                    current=temp;
                }
            }
        }
    }
    public void levelOrder(){
        if(root==null){
            return;
        }
        Queue <TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode temp=queue.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null){
                queue.offer(temp.left);
            }
            if(temp.right!=null){
                queue.offer(temp.right);
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        prg2 obj=new prg2();
        obj.createTree();
        obj.preOrder();
        System.out.println();
        obj.inOrder();
        System.out.println();
        obj.postOrder();
        obj.levelOrder();
    }
}
