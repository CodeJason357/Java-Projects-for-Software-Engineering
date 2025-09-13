import java.util.Scanner;
public class Main{
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Welcome to BMI Calculator");
      float weight,height,BMI;
      System.out.print("Enter your Weight in (kg) = ");
      weight = input.nextFloat();
      input.nextLine();
      System.out.print("Enter your Height in (m) = ");
      height = input.nextFloat();
      input.nextLine();
      BMI = weight/(height*height);
      System.out.println("Your BMI is = " + BMI);
      if(BMI < 18.5) {
          System.out.println("Underweight.");
      }
      if(BMI >= 18.5 && BMI <= 24.9) {
          System.out.println("Normal.");
      }
      if(BMI >= 25 && BMI <= 29.9) {
          System.out.println("Overweight.");
      }
      if(BMI >= 30) {
          System.out.println("Obese.");
      }
      }
  }
