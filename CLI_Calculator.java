import java.util.Scanner;
public class Main{
    static float sum(float x,float y) {
        return x + y;
    }
    static float sub(float x,float y) {
        return x - y;
    }
    static float multiply(float x,float y) {
        return x * y;
    }
    static float division(float x,float y) {
        return x / y;
    }
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int choice;
      float num1, num2;
      System.out.println("Welcome to CLI Calculator");
      System.out.println("Choose Operation Between(1-4) > ");
      System.out.println("1.+");
      System.out.println("2.-");
      System.out.println("3.*");
      System.out.println("4./");
      choice = input.nextInt();
      input.nextLine();
      switch(choice) {
          case 1:
            System.out.print("Enter num1 = ");
            num1 = input.nextInt();
            input.nextLine();
            System.out.print("Enter num2 = ");
            num2 = input.nextInt();
            input.nextLine();
            float Sum = sum(num1, num2);
            System.out.print("Summation = " + Sum);
            break;
          case 2:
            System.out.print("Enter num1 = ");
            num1 = input.nextInt();
            input.nextLine();
            System.out.print("Enter num2 = ");
            num2 = input.nextInt();
            input.nextLine();
            float Sub = sub(num1, num2);
            System.out.print("Substraction = " + Sub);
            break;
          case 3:
            System.out.print("Enter num1 = ");
            num1 = input.nextInt();
            input.nextLine();
            System.out.print("Enter num2 = ");
            num2 = input.nextInt();
            input.nextLine();
            float Mul = multiply(num1, num2);
            System.out.print("Multiplication = " + Mul);
            break;
          case 4:
            System.out.print("Enter num1 = ");
            num1 = input.nextInt();
            input.nextLine();
            System.out.print("Enter num2 = ");
            num2 = input.nextInt();
            input.nextLine();
            float Div = division(num1, num2);
            System.out.print("Division = " + Div);
            break;
      }
      input.close();
      }
  }
