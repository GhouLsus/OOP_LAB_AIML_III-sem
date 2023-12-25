import pk1.Employee;
import java.util.*;


public class FullTimeEmployee {
    double bonus, deductions;

    FullTimeEmployee(String name, double bonus, double deductions)
    {
        this.name = name;
        this.bonus = bonus;
        this.deductions = deductions;
        computeNetSal();
    }
    @Override
    void computeNetSal(){
        super.computeNetSal();
        netSal += bonus - deductions;
    }
    @Override
    void display() {
        System.out.println("Name: " + name
            + "\nNet sal: " + netSal
            + "\nBonus: " + bonus 
            + "\nDeductions: " + deductions);
    }
}
