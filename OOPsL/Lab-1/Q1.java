import java.util.*;

public class Q1{
    public static void main(String[] args) {
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the first number");
        x = sc.nextInt();
        System.out.println("Enter the value of the second number");
        y = sc.nextInt();
        System.out.println("Enter the value of the third number");
        z = sc.nextInt();

        if(x>y && x>z){
            System.out.println("First number is the biggest that is "+x);
        }
        else if(y>x && y>z){
            System.out.println("Second number is the biggest that is "+y);
        }
        else{
            System.out.println("Third number is the biggest that is"+z);
            sc.close();
        }
    }
}