package BinaryTree;

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
    public static void main(String[] args) {
        prg3 obj=new prg3();
        obj.onCreate();
        int result=obj.findMax(obj.root);
        System.out.println(result);
    }
}
