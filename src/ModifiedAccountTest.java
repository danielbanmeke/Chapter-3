import java.util.Scanner;

public class ModifiedAccountTest {
    public static void main(String[] args) {
        ModifiedAccount account3 = new ModifiedAccount("Daniel Banmeke", 50.00);
        ModifiedAccount account4 = new ModifiedAccount("Donald Chuks",  30.00);

        System.out.printf("%s balance: $%.2f%n", account3.getName(), account3.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account4.getName(), account4.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter withdrawal amount for account1: ");
        double withdrawAmount = input.nextDouble();
        System.out.printf("%ndeducting %.2f from account1 balance%n%n", withdrawAmount);
        account3.withdraw(withdrawAmount);

        System.out.printf("%s balance: $%.2f%n", account3.getName(), account3.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account4.getName(), account4.getBalance());

        System.out.print("Enter withdrawal amount for account2: ");
        withdrawAmount = input.nextDouble();
        System.out.printf("%ndeducting %.2f from account2 balance%n%n", withdrawAmount);
        account4.withdraw(withdrawAmount);

        System.out.printf("%s balance: $%.2f%n", account3.getName(), account3.getBalance());
        System.out.printf("%s balance: $%.2f%n", account4.getName(), account4.getBalance());
    }
}
