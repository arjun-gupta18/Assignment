
//class Node{
//    int data;
//    Node left;
//    Node right;
//
//    Node(int val){
//        data=val;
//        left=null;
//        right=null;
//    }
//}
public class Q4 {
    public boolean BST(Node root){
        return helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    public boolean helper(Node root,int min,int max){
        if(root==null) return true;
        if(root.data>max||root.data<min) return false;
        return helper(root.left,min,root.data) && helper(root.right,root.data,max);
    }
}
