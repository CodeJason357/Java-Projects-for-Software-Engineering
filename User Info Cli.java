import java.util.Scanner;
public class Main{
  public static void main(String[] args){
      String name, city;
      float age;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter your name > ");
      name = input.nextLine();
      System.out.print("Enter your age = ");
      age = input.nextInt();
      input.nextLine();
      System.out.print("Enter your city > ");
      city = input.nextLine();
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("City: " + city);
  }
}