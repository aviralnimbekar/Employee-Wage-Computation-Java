public class EmployeeWage {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        int is_Present = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if ( empCheck == is_Present )
            System.out.println("Employee is Present");
        else
        System.out.println("Employee is Absent");
    }
}