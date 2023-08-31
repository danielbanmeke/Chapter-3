import java.util.Scanner;

public class DateTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter month of birth");
        int month = input.nextInt();
        System.out.println("Enter day of birth");
        int day = input.nextInt();
        System.out.println("Enter year of birth");
        int year = input.nextInt();

        Date display = new Date(month, day, year);

        System.out.println();
        System.out.printf("Date of birth is: %d/%d/%d", display.getMonth(), display.getDay(), display.getYear());
    }
}
