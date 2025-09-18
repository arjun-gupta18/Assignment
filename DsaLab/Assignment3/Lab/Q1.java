import java.util.*;
public class Q1
{
	public static void main(String[] args) {
		 Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter size of stack");
        int n = scanner.nextInt();
        Stack st = new Stack(n);
        int choice;
        do{
           System.out.println("\nMenu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Check if Empty");
            System.out.println("4. Display Stack");
            System.out.print("5. Peek");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter value to push:");
                    int val = scanner.nextInt();
                    st.push(val);
                    break;
                case 2:
                    st.pop();
                    break;
                    case 3:
                        if(st.isEmpty()){
                            System.out.print("Stack is Empty");
                        } else{
                            System.out.print("Stack is non-empty");
                        }
                        break;
                case 4:
                    st.display();
                    break;
                case 5:
                    st.peek();
                    break;
                case 6:
                        System.out.print("Exiting program");
                        break;
                default :
                        System.out.print("Invalid choice !");
            }
        } while(choice!=6);
        scanner.close();
	}
}

 class Stack {
    private int[] arr;
    private int top;
    private int size;

    // Constructor to initialize the stack
    public Stack(int size) {
        arr = new int[size];
        size = size;
        top = -1;
    }
    public void push(int x){
        if(isFull()){
            System.out.println("Stack overflow");
            return ;
        }
        arr[++top] = x;
        System.out.println(x +"pushed to stack");
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Cannot pop");
            return -1;
        }
        int ans = arr[top--];
        System.out.println(ans + "popped from stack");
        return ans;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top>=size;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return ;
        }
        System.out.println("Stack elements :");
        for(int i=top;i>=0;i--){
            System.out.println(arr[i] + "");
        }
        System.out.println();
    }
    public int peek(){
        if(isEmpty()){
            System.out.print("Stack is empty");
        }
            return arr[top];
    }
    }