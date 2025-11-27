class Node{
    int data;
    Node left;
    Node right;

    Node(int val){
        data=val;
        left=null;
        right=null;
    }
}
public class Q2 {
    public Node Search(Node root, int target){
        while(root!=null&&root.data!=target){
            if(target<root.data) root=root.left;
            else{
                root=root.right;
            }
        }
        return root;
    }

    public Node SearchRec(Node root, int target){
    if(root.data==target) return root;
    if(target<root.data) SearchRec(root.left,target);
    else{
        SearchRec(root.right,target);
    }
    return null;
    }


    public int Max(Node root){
        while(root!=null){
            root=root.right;
        }
        return root.data;
    }
    public int Min(Node root){
        while(root!=null){
            root=root.left;
        }
        return root.data;
    }



    }

