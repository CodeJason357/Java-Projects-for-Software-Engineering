import java.util.Scanner;
public class Main{
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Welcome to Unit Converter");
      float kg,gram,cm,m,cel,faren;
      int choice;
      System.out.println("1.Convert Kg -> Gram.");
      System.out.println("2.Convert Gram -> Kg.");
      System.out.println("3.Convert Centimeter -> Meter.");
      System.out.println("4.Convert Meter -> Centimeter.");
      System.out.println("5.Convert Celcius -> Farenhite.");
      System.out.println("6.Convert Farenhite -> Celcius.");
      System.out.print("Enter Choice Between (1-6) > ");
      choice = input.nextInt();
      input.nextLine();
      if(choice == 1) {
          System.out.print("Enter value in Kg = ");
          kg = input.nextFloat();
          input.nextLine();
          gram = kg*1000;
          System.out.println(kg + " in Gram -> " + gram);
      }
      else if(choice == 2) {
          System.out.print("Enter value in Gram = ");
          gram = input.nextFloat();
          input.nextLine();
          kg = gram/1000;
          System.out.println(gram + " in Kg -> " + kg);
      }
      else if(choice == 3) {
          System.out.print("Enter value in Centimeter = ");
          cm = input.nextFloat();
          input.nextLine();
          m = cm/100;
          System.out.println(cm + " in Meter -> " + m);
      }
      else if(choice == 4) {
          System.out.print("Enter value in Meter = ");
          m = input.nextFloat();
          input.nextLine();
          cm = m*100;
          System.out.println(m + " in Centimeter -> " + cm);
      }
      else if(choice == 5) {
          System.out.print("Enter value in Celcius = ");
          cel = input.nextFloat();
          input.nextLine();
          faren = (cel*9/5)+32;
          System.out.println(cel + " in Farenhite -> " + faren);
      }
      else if(choice == 6) {
          System.out.print("Enter value in Farenhite = ");
          faren = input.nextFloat();
          input.nextLine();
          cel = (faren-32)*5/9;
          System.out.println(faren + " in Celcius -> " + cel);
      }
      input.close();
      }
  }
