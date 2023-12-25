import java.util.Scanner;

interface Sports{
    void putGrade(int a);
    void displayMarks();
}

class Student{
    int rollnum, marks;

    Student(int r, int m){
        putNumber(r);//wtf is this
        putMarks(m);
    }
    void putNumber(int a){
        rollnum = a;
    }
    void putMarks(int a){
        marks = a;
    }
    int getNumber(){
        return rollnum;
    }
    int getMarks(){
        return marks;
    }
}
class Result extends Student implements Sports{
    int sportsgrade;
    Result(int n, int m, int s){//wtf are these parameters
        super(n, m);
        putGrade(s);
    }
    public void putGrade(int a){ //wtf how is it assigning
        sportsgrade = a;
    }
    public int getGrade(){
        return sportsgrade;
    }
    public void displayMarks(){
        System.out.println("Roll Num:"+getNumber()+"\n");
    }
    // @Override//dont exactly understand wtf is ovverride
    // public void putGrade() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'putGrade'");//wont run without this wtf is this
    // }
    // @Override
    // public int displayMarks() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'displayMarks'");
    // }

}
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the fuckin roll number you imbecible piece of dog shit");
        int n = sc.nextInt();
        System.out.println("Enter your trashy marks like the trash you are");
        int m = sc.nextInt();
        System.out.println("Enter the Sports grade");
        int s = sc.nextInt();
        Result st = new Result(n, m, s);
        System.out.println("Displaying the results");
        st.displayMarks();
        sc.close();
    }
    
}
