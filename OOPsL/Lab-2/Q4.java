// import java.util.*;
// import java.util.Scanner;

// public class Q4 {
//     public static void main(String[] args)
//     {
//         int x,y,i,j,m,n;
//         int sum = 0;
//         Scanner sc  = new Scanner(System.in);
//         int arr [][] =  new int[i][j];
//         System.out.println("Enter the number of rows MATRIX 1:");
//         System.out.println("Enter the number of columns MATRIX 1:");
//         x = sc.nextInt();
//         y = sc.nextInt();
//         for (i = 0; i<x; i++)
//         {
//             for (j = 0; j<y ; j++)
//             {
//                 arr[x][y] = sc.nextInt();
//             }
//         }
    
//         System.out.println("Enter the number of rows MATRIX 2:");
//         System.out.println("Enter the number of columns MATRIX 2:");
//         m = sc.nextInt();
//         n = sc.nextInt();
//         for (i = 0; i<m; i++)
//         {
//             for (j = 0; j<n ; j++)
//             {
//                 arr[m][n] = sc.nextInt();
//             }
//         }
//         if (x==m && y==n)
//         {
//             sum = arr[x][y] + arr[m][n];
//             System.out.println("The sum is:"+sum);
//         }
//         else
//         {
//             System.out.println("Sum not possible");
//         }
//     }
// }
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int x, y, m, n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows MATRIX 1:");
        x = sc.nextInt();
        System.out.println("Enter the number of columns MATRIX 1:");
        y = sc.nextInt();
        int arr1[][] = new int[x][y];

        System.out.println("Enter the elements of MATRIX 1:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the number of rows MATRIX 2:");
        m = sc.nextInt();
        System.out.println("Enter the number of columns MATRIX 2:");
        n = sc.nextInt();
        int arr2[][] = new int[m][n];

        System.out.println("Enter the elements of MATRIX 2:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        if (x == m && y == n) {
            int result[][] = new int[x][y];
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    result[i][j] = arr1[i][j] + arr2[i][j];
                }
            }

            System.out.println("Matrix Sum:");
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix addition is not possible. Dimensions do not match.");
        }
    }
}
