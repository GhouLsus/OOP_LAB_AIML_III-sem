// import java.util.*;

// public class Q2 {
//     public static int reverse(int number){
//         int x;
//         int rev=0;
//         Scanner sc = new Scanner(System.in);
//         x = sc.nextInt();
//         while (x != 0)
//         {
//             int d = x%10;
//             rev = rev*10 + d;
//             x /= 10;
//         }
//         return rev;
//     }
//     public static void main(String[] args){
//         System.out.println("Enter the number that you want to reverse:");
//     System.out.println("The reversed number is "+rev);
//     }
// }
import java.util.Scanner;

public class Q2 {
    public static int reverse(int number) {
        int rev = 0;
        while (number != 0) {
            int d = number % 10;
            rev = rev * 10 + d;
            number /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number that you want to reverse:");
        int inputNumber = sc.nextInt();

        int reversedNumber = reverse(inputNumber);

        System.out.println("The reversed number is " + reversedNumber);
    }
}

