import java.util.ArrayList;
import java.util.List;

public class Q1 {

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

//PREORDER

    public static void preOrderHelper(Node head, List<Integer> arr){
    if(head==null) return;
    arr.add(head.data);
    preOrderHelper(head.left,arr);
    preOrderHelper(head.right,arr);
    }

    public static List<Integer> preorder(Node head){
    List<Integer> ans = new ArrayList<>();
    preOrderHelper(head,ans);
    return ans;
    }


//INORDER

    public static void inOrderHelper(Node head, List<Integer> arr){
        if(head==null) return;
        inOrderHelper(head.left,arr);
        arr.add(head.data);
        inOrderHelper(head.right,arr);
    }

    public static List<Integer> inorder(Node head){
        List<Integer> ans = new ArrayList<>();
        inOrderHelper(head,ans);
        return ans;
    }

//POSTORDER

    public static void postOrderHelper(Node head, List<Integer> arr){
        if(head==null) return;
        postOrderHelper(head.left,arr);
        postOrderHelper(head.right,arr);
        arr.add(head.data);
    }

    public static List<Integer> postorder(Node head){
        List<Integer> ans = new ArrayList<>();
        postOrderHelper(head,ans);
        return ans;
    }
}