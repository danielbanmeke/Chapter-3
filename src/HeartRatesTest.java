import java.util.Scanner;

public class HeartRatesTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String firstName = input.next();
        System.out.println("Enter last name: ");
        String lastName = input.next();
        System.out.println("Enter month of birth: ");
        int month = input.nextInt();
        System.out.println("Enter day of birth: ");
        int day = input.nextInt();
        System.out.println("Enter year of birth: ");
        int year = input.nextInt();

        HeartRates display = new HeartRates(firstName, lastName, month, day, year);

        System.out.println();
        System.out.printf(" First Name: %s%n Last Name: %s%n Date of birth: %d/%d/%d%n Age in Years: %d%n Maximum Heart Rate is: %d%n Target Heart Rate is: %d%n %n", display.getFirstName(), display.getLastName(), display.getMonth(), display.getDay(), display.getYear(), display.getAge(), display.getMaximumHeartRate(), display.getTargetHeartRate());
    }
}
