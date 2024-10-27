import java.util.Scanner;

interface i1 {
    public void push(int p);

    public int pop();
}

class demo implements i1 {
    int[] mystack;
    int tos;

    demo(int size) {
        mystack = new int[size];
        tos = -1;
    }

    public void push(int p) {
        if (tos == mystack.length - 1) {
            System.out.println("Stack Overflow");
        } else {

            mystack[++tos] = p;

        }
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return mystack[tos--];
        }
    }
}

class Stackinterface {
    public static void main(String args[]) {

        demo d1 = new demo(5);
        demo d2 = new demo(10);
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter value in stack1");
            int r = sc.nextInt();
            d1.push(r);
        }
        for (int i = 0; i < 10; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter value in stack2");
            int r = sc.nextInt();
            d2.push(r);
        }
        System.out.println("Stack is");
        for (int i = 0; i < 5; i++) {

            System.out.println(d1.pop());
        }
        System.out.println("Stack2 is");
        for (int i = 0; i < 10; i++) {

            System.out.println(d2.pop());
        }

    }
}
