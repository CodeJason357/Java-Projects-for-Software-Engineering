import java.util.Scanner;
public class Main{
    static void Celcius_to_Farenhite(float cel) {
        float faren = (cel*(9/5))+32;
        System.out.print(cel + " in Farenhite -> " + faren);
    }
    static void Farenhite_to_Celcius(float faren) {
        float cel = (faren-32)*(5/9);
        System.out.print(faren + " in Celcius -> " + cel);
    }
    static void Celcius_to_Kelvin(float cel) {
        float kel = cel+273.15f;
        System.out.print(cel + " in Kelvin -> " + kel);
    }
    static void Kelvin_to_Celcius(float kel) {
        float cel = kel-273.15f;
        System.out.print(kel + " in Celcius -> " + cel);
    }
      public static void main(String[] args){
          Scanner input = new Scanner(System.in);
          int choice;
          System.out.println("Welcome to Temperature Converter.");
          System.out.println("1.Celcius -> Farenhite");
          System.out.println("2.Farenhite -> Celcius");
          System.out.println("3.Celcius -> Kelvin");
          System.out.println("4.Kelvin -> Celcius");
          System.out.print("Enter choice between(1-4) > ");
          choice = input.nextInt();
          switch(choice) {
              case 1:
                 System.out.print("Enter Temperature in Celcius = ");
                 float celcius = input.nextFloat();
                 Celcius_to_Farenhite(celcius);
                 break;
              case 2:
                 System.out.print("Enter Temperature in Farenhite = ");
                 float faren = input.nextFloat();
                 Farenhite_to_Celcius(faren);
                 break;
              case 3:
                 System.out.print("Enter Temperature in Celcius = ");
                 float celcius2 = input.nextFloat();
                 Celcius_to_Kelvin(celcius2);
                 break;
              case 4:
                 System.out.print("Enter Temperature in Kelvin = ");
                 float kelvin = input.nextFloat();
                 Kelvin_to_Celcius(kelvin);
                 break;
          }
      input.close();
      }
  }