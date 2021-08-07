public class EmployeeWage {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        int is_Full_Time_Present = 1;
        int is_Part_Time_Present = 2;
        int emp_Wage_Per_hrs = 20;
        int emp_Working_Hrs = 0;
        double empCheck = Math.floor(Math.random() * 10) % 3;

        if ( empCheck == is_Full_Time_Present ) {
            System.out.println("Employee is Full Time Present");
            emp_Working_Hrs = 8;
        }
        else if ( empCheck == is_Part_Time_Present ) {
            System.out.println("Employee is Part Time Present");
            emp_Working_Hrs = 4;
        }
        else {
            System.out.println("Employee is Absent");
        }

        int Salary = emp_Wage_Per_hrs * emp_Working_Hrs;
        System.out.println("Salary = " + Salary);
    }
}