import java.util.Scanner;
public class Main{
    static void gradechecker(float mark1,float mark2,float mark3) {
        float total = mark1+mark2+mark3;
        float average = total/3.0f;
        String grade;
        if(average >= 80) {
            grade = "A+";
            System.out.println("Student's Grade is = [" + grade + "]");
        }
        else if(average >=70 && average <80) {
            grade = "A";
            System.out.println("Student's Grade is = [" + grade + "]");
        }
       else if(average >=60 && average <70) {
            grade = "B";
            System.out.println("Student's Grade is = [" + grade + "]");
        }
        else if(average >=50 && average <60) {
            grade = "C";
            System.out.println("Student's Grade is = [" + grade + "]");
        }
        else if(average >=40 && average <50) {
            grade = "D";
            System.out.println("Student's Grade is = [" + grade + "]");
        }
        else {
            grade = "F";
            System.out.println("Student's Grade is = [" + grade + "]");
        }
    }
      public static void main(String[] args){
          Scanner input = new Scanner(System.in);
          float sub1, sub2, sub3;
          System.out.print("Enter marks of Subject1 = ");
          sub1 = input.nextFloat();
          System.out.print("Enter marks of Subject2 = ");
          sub2 = input.nextFloat();
          System.out.print("Enter marks of Subject3 = ");
          sub3 = input.nextFloat();
          gradechecker(sub1,sub2,sub3);
      input.close();
      }
  }