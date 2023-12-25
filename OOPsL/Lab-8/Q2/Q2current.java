import java.util.Scanner;

//------------------------------------------------------------------------------------------------------------------------------//

class myExceptions extends Exception {
    private String errorCode;

    myExceptions(String err) {
        errorCode = err;
    }

    String getCode() {
        return errorCode;
    }
}

// ------------------------------------------------------------------------------------------------------------------------------//

class CurrentDate {
    int day, month, year;

    void createDate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Day");
        day = sc.nextInt();
        System.out.println("Enter the month");
        month = sc.nextInt();
        System.out.println("Enter the year");
        year = sc.nextInt();
        sc.close();
    }
}

// ------------------------------------------------------------------------------------------------------------------------------//

public class Q2current {
    myExceptions invalMonth = new myExceptions("INVALID MONTH");
    myExceptions invalDay = new myExceptions("INVALID DAY");
    
    try{
        CurrentDate cd = new CurrentDate();
        cd.createDate();
        if (cd.month > 12 || cd.month < 1) {
            throw invalMonth;
        } else if (cd.month == 1 || cd.month == 3 || cd.month == 5 || cd.month == 7 || cd.month == 8 || cd.month == 10
                || cd.month == 12)
            if (cd.day > 31 || cd.day < 1)
                throw invalDay;
            else if (cd.month == 2) {
                if (cd.year % 4 == 0) {
                    if (cd.day > 29 || cd.day < 1)
                        throw invalDay;
                } else {
                    if (cd.day > 28 || cd.day < 1) {
                        throw invalDay;
                    }
                }

            } else {
                if (cd.day > 30 || cd.day < 1)
                    throw invalDay;
            }
    }catch(
    myExceptions e)
    {
        System.out.println("Exception thrown" + e.getCode());
    }
}}
