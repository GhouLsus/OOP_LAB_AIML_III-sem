import java.util.*;
import pk1.Employee;

public class PartTimeEmployee extends Employee{
    int hours_worked;
    static final double hourly_rate = 10.0; 
    PartTimeEmployee(String name, int hours_worked)
    {
        super("hardik","12",4500.0);
        this.hours_worked = hours_worked;
        computeNetSal();
    }
    @Override
    public void computeNetSal() {
        NetSal = hours_worked * hourly_rate;
    }
    @Override
    public void display() {
            System.out.println("Part time employee:" +name);
            System.out.println();
            System.out.println("Part time employee Salary" +NetSal);
        }
}
// public class PartTimeEmployee extends Employee {
//     int hours_worked;
//     static final double hourly_rate = 10.0;

//     public PartTimeEmployee(String name, int hours_worked) {
//         super(name, "PT" + generateUniqueID(), 0); // Assuming you have a method generateUniqueID to create a unique ID
//         this.hours_worked = hours_worked;
//         computeNetSal();
//     }

//     @Override
//     void computeNetSal() {
//         NetSal = hours_worked * hourly_rate;
//     }

//     @Override
//     void display() {
//         System.out.println("Part-time employee: " + name);
//         System.out.println("Part-time employee Salary: " + NetSal);
//     }
// }
