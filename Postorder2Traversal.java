import java.util.*;
class TreeNode{
    int value;
    TreeNode left,right;
    TreeNode( int value){
        this.value=value;
        left=right=null;
    } 
}
public class Postorder2Traversal{
    public void Postorder(TreeNode root){
        if(root==null)
        return;
    
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.value+" ");
    }
    public static class inorderTraversal{
        public void inorder(TreeNode root){
            if(root==null)
            return;
        
            inorder(root.left);
            System.out.print(root.value+" ");
            inorder(root.right);
            
        }
        public static class preorderTraversal{
            public void preorder(TreeNode root){
                if(root==null)
                return;
                System.out.print(root.value+" ");
                preorder(root.left);
                preorder(root.right);
                
            }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.right=new TreeNode(5);
        root.left.left=new TreeNode(3);
        root.right.left=new TreeNode(7);
        root.right.right=new TreeNode(6);
        root.left.left.right=new TreeNode(9);
        root.right.right.left=new TreeNode(8);
        root.left.left.right.left=new TreeNode(1);
        PostorderTraversal tree=new PostorderTraversal(); 
        System.out.println("postoutput");
        tree.Postorder(root);
        inorderTraversal tree1=new inorderTraversal();
        System.out.println(""); 
        System.out.println("inoutput");
        tree1.inorder(root);
        preorderTraversal tree2=new preorderTraversal();
        System.out.println(""); 
        System.out.println("preoutput");
        tree2.preorder(root);
    }
}
    }
}
    

