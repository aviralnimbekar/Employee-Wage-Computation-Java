public class EmployeeWage {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        //  is_Full_Time_Present = 1;
        //  is_Part_Time_Present = 2;
        int emp_Working_day_Per_Month = 20;
        int emp_Wage_Per_hrs = 20;
        int emp_Working_Hrs = 0;
        int empCheck = (int)(Math.floor(Math.random() * 10) % 3);

        switch (empCheck) {
            case 1:
                System.out.println("Employee is Full Time Present");
                emp_Working_Hrs = 8;
            break;
            case 2:
                System.out.println("Employee is Part Time Present");
                emp_Working_Hrs = 4;
            break;
            default:
                System.out.println("Employee is Absent");
            break;
        }

        int Salary = emp_Working_day_Per_Month * emp_Wage_Per_hrs* emp_Working_Hrs;
        System.out.println("Salary for month = " + Salary);
    }
}