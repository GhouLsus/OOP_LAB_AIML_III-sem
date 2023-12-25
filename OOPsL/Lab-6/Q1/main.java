import pk1.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new FullTimeEmployee("Full Timer", 100, 20);
        employee.display();

        employee = new PartTimeEmployee("Part Timer", 20);
        employee.display();
    }
}
