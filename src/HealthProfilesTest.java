import java.util.Scanner;

public class HealthProfilesTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String firstName = input.next();
        System.out.println("Enter last name: ");
        String lastName = input.next();
        System.out.println("Enter gender: ");
        String gender = input.next();
        System.out.println("Enter month of birth: ");
        int month = input.nextInt();
        System.out.println("Enter day of birth: ");
        int day = input.nextInt();
        System.out.println("Enter year of birth: ");
        int year = input.nextInt();
        System.out.println("Enter height: ");
        double height = input.nextDouble();
        System.out.println("Enter weight: ");
        double weight = input.nextDouble();

        HealthProfiles display = new HealthProfiles(firstName, lastName, gender, month, day, year, height, weight);

        System.out.println();
        System.out.printf(" First Name: %s%n Last Name: %s%n Gender: %s%n Date of birth: %d/%d/%d%n Height: %.2f%n Weight %.2f%n Age in Years: %d%n BMI: %.2f%n Maximum Heart Rate is: %d%n Target Heart Rate is: %d%n %n", display.getFirstName(), display.getLastName(), display.getGender(), display.getMonth(), display.getDay(), display.getYear(), display.getHeight(), display.getWeight(), display.getAge(), display.getBMI(), display.getMaximumHeartRate(), display.getTargetHeartRate());

        System.out.println("BMI VALUES");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal:      between 18.5 and 24.9");
        System.out.println("Overweight:  between 25 and 29.9");
        System.out.println("Obese:       30 or greater");
    }
}