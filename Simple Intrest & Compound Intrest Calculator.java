import java.util.Scanner;
public class Main{
    static void SimpleIntrest(float p, float r, float t) {
        float SI = (p*r*t)/100.0f;
        System.out.print("Simple Intrest is = " + SI);
    }
    static void CompoundIntrest(float p, float r, float t) {
        float base = 1+(r/100.0f);
        float power = (float)Math.pow(base, t);
        float A = p*power;
        float CI = A-p;
        System.out.print("Compound Intrest is = " + CI);
    }
      public static void main(String[] args){
          Scanner input = new Scanner(System.in);
          float P,R,T;
          int choice;
          System.out.println("Simple Interest & Compound Interest Calculator");
          System.out.print("Enter Principal amount = ");
          P = input.nextFloat();
          System.out.print("Enter Rate of Intrest (per year,%) = ");
          R = input.nextFloat();
          System.out.print("Enter Time (in year) = ");
          T = input.nextFloat();
          System.out.println("Enter chice between(1-2) > ");
          System.out.println("1. Simple Intrest");
          System.out.println("2. Compound Intrest");
          choice = input.nextInt();
          switch(choice) {
              case 1:
                 SimpleIntrest(P, R, T);
              case 2:
               CompoundIntrest(P, R, T);
          }
      input.close();
      }
  }