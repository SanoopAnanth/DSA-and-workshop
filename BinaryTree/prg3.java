package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class prg3 {
    private TreeNode root;
    private class TreeNode{
        private TreeNode left,right;
        private int data;
        public TreeNode(int data){
            this.data=data;
        }
    }
    public void onCreate(){
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
    public void insert(int value){
        root=insert(root, value);
    }
    public TreeNode insert(TreeNode root,int value){
        if(root==null){
            root=new TreeNode(value);
            return root;
        }
        if(value < root.data){
            root.left=insert(root.left, value);
        }
        if(value>root.data){
            root.right=insert(root.right, value);
        }
        return root;
    }
    public void inOrder(){
        inOrder(root);
    }
    public void inOrder(TreeNode root)
    {
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data);
        inOrder(root.right);
    }
    public int findMax(TreeNode root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int result=root.data;
        int left=findMax(root.left);
        int right=findMax(root.right);
        if(left>result){
            result=left;
        }
        if(right>result){
            result=right;
        }
        return result;
    }
    public TreeNode search(int key){
        return search(root,key);
    }
    public TreeNode search(TreeNode root,int key){
        if(root==null||root.data==key){
            return root;
        }
        if(key>root.data){
            return search(root.right,key);
        }
        else{
            return search(root.left,key);
        }
    }
    public static void main(String[] args) {
        prg3 obj=new prg3();
        obj.insert(5);
        obj.insert(7);
        obj.insert(3);
        obj.insert(2);
        obj.insert(4);
        obj.insert(8);
        obj.insert(9);
        obj.insert(10);
        obj.inOrder();
        System.out.println();
        TreeNode result=obj.search(11);
        if(result==null){
            System.out.println("Key not found");
        }else{
            System.out.println("key found in the Binary tree");
        }
    }
}
