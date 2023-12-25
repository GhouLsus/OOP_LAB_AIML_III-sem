package pk1;
import java.util.*;
import java.util.Scanner;

public class Employee { 
    public String name, id;
    public double basic, DA , grossSAL , IT , NetSal; 

    public Employee (String name, String id , double basic )
    {
       this.name = name;
       this.id = id;
       this.basic = basic;
       computeNetSal();
    }
    public Employee(){
        this.name = "Hardik";
        this.id = "014";
        this.basic = 3;
        computeNetSal();
    }
    
    public void computeNetSal(){
        DA = 0.52 *basic;
        grossSAL = basic + DA;
        IT = 0.3 * grossSAL;
        NetSal = grossSAL - IT;
    }

    public void display()
    {
        // System.out.println("Name: " + name);
        // System.out.println();
        // System.out.println("ID: " + id);
        // System.out.println();
        // System.out.println("basic Salary: " + basic);
        // System.out.println();
        // System.out.println("salary: " + NetSal);
        // System.out.println();
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Basic Salary: " + basic);
            System.out.println("Salary: " + NetSal);
    }
}
