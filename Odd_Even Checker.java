import java.util.Scanner;
public class Main{
    static void odd_even_checker(int x) {
        if(x % 2 == 0) {
            System.out.print("Even Number");
        }
        else {
            System.out.print("Odd Number");
        }
    }
      public static void main(String[] args){
          Scanner input = new Scanner(System.in);
          int num;
          System.out.print("Enter num = ");
          num = input.nextInt();
          odd_even_checker(num);
      input.close();
      }
  }