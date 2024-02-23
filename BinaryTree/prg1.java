package BinaryTree;

public class prg1 {
    private TreeNode root;
    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;
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
    public void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public void postOrder(TreeNode root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        prg1 obj=new prg1();
        obj.createTree();
        obj.preOrder(obj.root);
        System.out.println();
        obj.inOrder(obj.root);
        System.out.println();
        obj.postOrder(obj.root);
    }
}
