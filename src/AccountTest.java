import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args){
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%naddding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());
    }
    public static void displayAccount(Account accountToDisplay){
        Account displayAccount = new Account("Donald Frank", 30.0);
        System.out.printf("%s balance: $%.2f%n", displayAccount.getName(), displayAccount.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%naddding %.2f to account1 balance%n%n", depositAmount);
        displayAccount.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n", displayAccount.getName(), displayAccount.getBalance());

        System.out.printf("%s balance: $%.2f%n", displayAccount.getName(), displayAccount.getBalance()); ;
    }
}