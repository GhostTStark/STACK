// import java.util.Stack;

public class test {

    public static class Stack {
        int arr[];
        int top;
        int length;

        Stack(int length) {
            this.length = length;
            top = -1;
            arr = new int[length];
        }

        void push(int data) {
            if (top == length - 1) {
                System.out.println("stack is full !");
            } else {
                top++;
                arr[top] = data;
            }
        }

        int pop() {
            if (top == -1) {
                System.out.println("stacl is empty");
            }
            int result = arr[top];
            top--;

            return result;
        }

        boolean isEmpty() {
            return top == -1;
        }

        int top() {
            if (top == -1) {
                System.out.println("stack is empty");
            }
            return arr[top];
        }
    }

    public static void main(String[] args) {
        // Stack s = new Stack(5);
        int ar[] = { 4,10,5,8,20,15,3,12 };
        Stack s = new Stack(ar.length);
        System.out.println(" ");
        for (int i = 0; i < ar.length; i++) {
            while (!s.isEmpty() && s.top() >= ar[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(s.top() + " ");
            }
            s.push(ar[i]);
        }
        System.out.println(" ");
    }
}