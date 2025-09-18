import java.util.Scanner;
public class Main{
    static void leap_year_checker(int year) {
        if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
            System.out.print("Leap Year");
        }
        else {
            System.out.print("Not Leap Year");
        }
    }
      public static void main(String[] args){
          Scanner input = new Scanner(System.in);
          int Year;
          System.out.print("Enter year = ");
          Year = input.nextInt();
          leap_year_checker(Year);
      input.close();
      }
  }