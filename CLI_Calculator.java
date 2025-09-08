import java.util.Scanner;
public class CLI_Calculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1;
        double num2;
        System.out.println("Enter num1 = ");
        num1 = input.nextDouble();
        System.out.println("Enter num2 = ");
        num2 = input.nextDouble();
        String operations;
        System.out.println("Enter Operations Betweem(+,-,*,/) > ");
        operations = input.next();
        double result = 0;
        boolean valid = true;
        if(operations.equals("+")) {
            result = num1+num2;
        }
        else if(operations.equals("-")) {
            result = num1-num2;
        }
        else if(operations.equals("*")) {
            result = num1*num2;
        }
        else if(operations.equals("/")) {
            if(num2 == 0) {
            System.out.println("Error: Divison by 0 not allowed.");
                valid = false;
        }
        else {
            result = num1/num2;
        }
        }
        else {
            System.out.println("Invalid Operations");
        }
        input.close();
        System.out.println("Result = " + result);
    }
}