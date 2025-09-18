import java.util.Scanner;
public class Main{
    static void eligibility_checker(int age) {
        if(age >= 18) {
            System.out.print("Can Vote");
        }
        else {
           System.out.print("Can't Vote"); 
        }
    }
      public static void main(String[] args){
          Scanner input = new Scanner(System.in);
          int Age;
          System.out.print("Enter your age = ");
          Age = input.nextInt();
          eligibility_checker(Age);
      input.close();
      }
  }