import java.util.Scanner;

class stackExceptions extends Exception {
    private String errorCode;

    stackExceptions(String err) {
        errorCode = err;
    }

    String getCode() {
        return errorCode;
    }
}

class stack {
    int arr[];
    int tos;
    Scanner sc = new Scanner(System.in);
    stackExceptions stackFull = new stackExceptions("OVERFLOW");
    stackExceptions stackEMPTY = new stackExceptions("UNDERFLOW");

    void initialiseTOS() {
        tos = -1;
        System.out.println("Enter max ");
        int n = sc.nextInt();
        arr = new int[n];
    }

    void push() throws stackExceptions {
        try {
            if (tos == arr.length - 1)
                throw stackFull;
            System.out.println("enter integer to push");
            arr[++tos] = sc.nextInt();
        } catch (stackExceptions e) {
            System.out.println("Error" + e.getCode());
            tos -= 1;
        }
    }

    int pop() throws stackExceptions {
        try {
            if (tos == -1)
                throw stackEMPTY;
            return arr[(tos--)];
        } catch (stackExceptions e) {
            System.out.println("Error." + e.getCode());
            tos += 1;
            return -1;
        }
    }
}

public class Q1stack {
    public static void main(String[] args) throws stackExceptions {
        Scanner sc = new Scanner(System.in);
        stack s = new stack();
        s.initialiseTOS();
        int input = 1;
        int flag = 1;
        while ((input != -1) | (flag != 0)) {
            System.out.println("Enter 1 for push, 2 for pop, -1 to exit");
            input = sc.nextInt();
            if (input == 1) {
                s.push();
            } else if (input == 2) {
                System.out.println("Integer popped is:" + s.pop());
            } else {
                System.out.println("Exiting");
                flag = 0;
            }
        }
        sc.close();
    }

}
