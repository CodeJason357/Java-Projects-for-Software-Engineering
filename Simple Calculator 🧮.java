import java.util.Scanner;
public class Main{
  public static void main(String[] args){
      int x,y;
      String operation;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter num1 = ");
      x = input.nextInt();
      System.out.print("Enter num2 = ");
      y = input.nextInt();
      input.nextLine();
      System.out.print("Enter Operation between(+ or - ) > ");
      operation = input.nextLine();
      if(operation.equals("+")) {
          int sum = x + y;
          System.out.println("Sum = " + sum);
      }
      if(operation.equals("-")){
          int sub = x - y;
          System.out.println("Sub = " + sub); 
      }
  }
}