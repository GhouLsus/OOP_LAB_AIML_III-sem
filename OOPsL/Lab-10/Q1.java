import java.util.Scanner;

public class Q1 {

    static <T> void exchange(T arr[], int a, int b) {
        T temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static <T> void display(T arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + " ");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Integer array, 2.String Array, 3.Double Array");
        int inp = sc.nextInt();
        System.out.print("Enter length of array ");
        int n = sc.nextInt();
        System.out.print("Enter index 1 ");
        int a = sc.nextInt();
        System.out.print("Enter index 2 ");
        int b = sc.nextInt();
        if (inp == 1){
            Integer arr[] = new Integer[n];
             for(int i=0;i < n; i++)
            {
                System.out.println("Enter data");
                arr[i] = sc.nextInt();
            }
            exchange(arr, a, b);
            display(arr);
        }
        else if (inp == 2){
            String arr[] = new String[n];
             for(int i=0;i < n; i++)
            {
                System.out.println("Enter data");
                arr[i] = sc.nextLine();
            }
            exchange(arr, a, b);
            display(arr);
    }
        else if (inp == 1){
            Double arr[] = new Double[n];
             for(int i=0;i < n; i++)
            {
                System.out.println("Enter data");
                arr[i] = sc.nextDouble();
            }
            exchange(arr, a, b);
            display(arr);
        }
        else{
            System.out.println("Invalid input");
        }
        sc.close();
    }
}