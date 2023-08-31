import javax.swing.JOptionPane;

public class AdditionModified
{
    public static void main(String[] args)
    {
        String number1 = JOptionPane.showInputDialog("Enter First Integer: ");
        String number2 = JOptionPane.showInputDialog("Enter Second Integer: ");

        //covert the input strings to integers
        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);

        //calculate the sum
        int sum = num1 + num2;

        String result =
                String.format("Sum is, %d,", sum);

        JOptionPane.showMessageDialog(null, result);
    }
}