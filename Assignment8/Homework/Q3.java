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
public class Q3 {
    public Node insert(Node root, int val){
        if (root == null) {
            Node ans = new Node(val);
            return ans;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }
}
