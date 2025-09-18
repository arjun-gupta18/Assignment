package AdditionalQues;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class Q1 {
    static Node getIntersection(Node head1, Node head2) {
        int len1 = getLength(head1);
        int len2 = getLength(head2);
        
        Node longer = len1 > len2 ? head1 : head2;
        Node shorter = len1 > len2 ? head2 : head1;
        int diff = Math.abs(len1 - len2);
        
        for (int i = 0; i < diff; i++) longer = longer.next;
        
        while (longer != null && shorter != null) {
            if (longer == shorter) return longer;
            longer = longer.next;
            shorter = shorter.next;
        }
        return null;
    }

    static int getLength(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
}

public class IntersectionOfLinkedLists {
    public static void main(String[] args) {
        // List 1: 1 -> 2 -> 3 \
        //                         -> 10 -> 11 -> 12
        // List 2:       4 -> 5 /
        Node common = new Node(10);
        common.next = new Node(11);
        common.next.next = new Node(12);

        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = common;

        Node head2 = new Node(4);
        head2.next = new Node(5);
        head2.next.next = common;

        Node intersection = LinkedListUtils.getIntersection(head1, head2);
        if (intersection != null) {
            System.out.println("Intersection node data: " + intersection.data);
        } else {
            System.out.println("No intersection found");
        }
    }
}
