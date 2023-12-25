// In the compute method, you haven't declared the avg variable. You should declare it as a double.

// In the compute method, the for loop should use a colon : to iterate over the marks_array. Replace for(int i=0 : marks_array) with for (int i : marks_array).

// In the display method, you are trying to access total and avg, but these variables are not declared within the method. You should declare them as instance variables in the student class.

// In the main method, you have a typo when creating the marks array. It should be int marks[] = new int[subjects];, not int marks[] = new Int(subjects);.

// You also haven't declared the variable i before using it in the for loop. You should add int i; before the for loop.
import java.util.*;
import java.util.Scanner;

class student {
    String sname;
    double avg;
    int[] marks_array;
    int total;
    
    void assign(String name, int[] marks)
    {
       sname = name;
       marks_array = marks; 
    }

    void compute()
    {
       int total = 0;
       for (int i : marks_array)
       {
        total += i ;
       }
       avg = (double) total/marks_array.length; 
    }
    
    void display()
    {
       System.out.println("Enter the name" +sname);
       System.out.println("Enter the marks");

       for(int i: marks_array)
       {
        System.out.println(i + " ");
       }
       System.out.println("Total Marks" +total);
       System.out.println("\n Average Marks" +avg);
    }
}

public class q1{
    public static void main(String[] args)
    {
       student student1 = new student();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the student name:");
       String name = sc.nextLine();
       System.out.println("Enter the number of subjects:");
       int subjects = sc.nextInt();
    //    int marks[] = new int(subjects);
       int marks[] = new int[subjects];
       System.out.println("Enter marks:");
       for(int i=0;i<subjects;i++)
       {
        marks[i]=sc.nextInt();
       }
       student1.assign(name, marks);
       student1.compute();
       student1.display();
    }
}