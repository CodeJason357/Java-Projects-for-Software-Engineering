import java.util.Scanner;
public class Main{
  public static void main(String[] args){
      String name;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter your name > ");
      name = input.nextLine();
      System.out.println("Hello, " + name + "! Have a nice day.");
  }
}