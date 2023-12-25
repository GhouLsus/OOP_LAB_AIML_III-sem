import java.util.*;
import java.util.Scanner;

public class Q1{
     void reverse(int arr[], int n)
    {
        int rev,i;
        for (i=0;i<n/2;i++)
        {
            rev = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = rev;
        }
    }
     void display (int arr[], int n)
    {
        for (int i=0;i<n;i++)
        {
           System.out.println("The Reversed array is:" + arr[i]);
        }
    }
    
    public static void main(String[] args)
    {
        int n,i;
        Scanner in = new Scanner(System.in);
        Q1 obj = new Q1();
        System.out.println("Enter the size of the array:");
        n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(i=0;i<n;i++)
        {
           arr[i] = in.nextInt();
        }
        obj.reverse(arr,n);
        obj.display(arr,n);
    }

}