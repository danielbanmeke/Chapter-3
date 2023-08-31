import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Enter First Name: ");
            String firstName = input.nextLine();

            System.out.println("Enter Last Name: ");
            String lastName = input.nextLine();

            System.out.println("Enter Monthly Salary: ");
            int monthlySalary = input.nextInt();

            System.out.println("Enter Twelve:");
            double annual = input.nextDouble();

            Employee salary = new Employee(firstName, lastName, monthlySalary, annual);

            System.out.println();
            System.out.printf("Part First Name: %s%nPart Last Name: %s%nMontly Salary: %d%nTwelve Months %.2f%nYearly Salary is: %.2f",
                        salary.getFirstName(), salary.getLastName(), salary.getMonthlySalary(), salary.annual(), salary.getYearlySalary());
    }
}