public class EmployeeWage {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        int is_Present = 1;
        int emp_Wage_Per_hrs = 20;
        int emp_Working_Hrs = 0;
        double empCheck = Math.floor(Math.random() * 10) % 2;

        if ( empCheck == is_Present ) {
            System.out.println("Employee is Present");
            emp_Working_Hrs = 8;
        }
        else {
            System.out.println("Employee is Absent");
        }

        int Salary = emp_Wage_Per_hrs * emp_Working_Hrs;
        System.out.println(Salary);
    }
}