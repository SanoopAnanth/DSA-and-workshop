package BinaryTree;

public class prg4 {
    TreeNode root;
    class TreeNode{
        TreeNode left,right;
        int data;
        TreeNode(int data){
            this.data=data;
        }
    }
    public int getHeight(TreeNode root){
        if(root==null){
            return -1;
        }
        int x=getHeight(root.left);
        int y=getHeight(root.right);
        if(x>y){
            return x+1;
        }else{
            return y+1;
        }
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
    public static void main(String[] args) {
        prg4 obj=new prg4();
        obj.insert(5);
        obj.insert(7);
        obj.insert(3);
        obj.insert(2);
        obj.insert(4);
        obj.insert(8);
        obj.insert(9);
        obj.insert(10);
        int result=obj.getHeight(obj.root);
        System.out.println(result);
    }
}
