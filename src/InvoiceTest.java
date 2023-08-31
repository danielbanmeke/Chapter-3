import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter product number: ");
        String number = input.nextLine();

        System.out.println("Enter Product Description: ");
        String description = input.nextLine();

        System.out.println("Enter Product Quantity: ");
        int quantity = input.nextInt();

        System.out.println("Enter Product Price: ");
        double price = input.nextDouble();

        Invoice amount = new Invoice(number, description, quantity, price);

        System.out.println();
        System.out.printf("Part number: %s%nPart description: %s%nQuantity: %d%nPrice per item: %.2f%nInvoice amount is: %.2f",
                amount.getNumber(), amount.getDescription(), amount.getQuantity(), amount.getUnitPrice(), amount.getInvoiceAmount());
    }
}
