import java.util.Scanner;


public class Q3 {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        x = sc.nextInt();
        int arr[]=new int[x];
        
        System.out.println("Enter the elements of the array");
        for (int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Prime Numbers in the array");
        for(int num : arr){
            if(isPrime(num){
                System.out.println(num + " ");
            }
        }
    }
    
}
