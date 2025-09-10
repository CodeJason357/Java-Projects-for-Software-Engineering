import java.util.Scanner;
public class StudentAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of students = ");
        int n = input.nextInt();
        input.nextLine(); // buffer clear

        String names[] = new String[n];
        int marksOFsubject1[] = new int[n];
        int marksOFsubject2[] = new int[n];
        int marksOFsubject3[] = new int[n];
        int total[] = new int[n];
        double average[] = new double[n];

        for(int i=0;i<n;i++) {
            System.out.println("Enter Student" + (i+1) + " name > ");
            names[i] = input.nextLine(); // এখন ঠিকমতো নাম নিবে

            System.out.println("Enter Marks of Subject1 for " + names[i] + " = ");
            marksOFsubject1[i] = input.nextInt();

            System.out.println("Enter Marks of Subject2 for " + names[i] + " = ");
            marksOFsubject2[i] = input.nextInt();

            System.out.println("Enter Marks of Subject3 for " + names[i] + " = ");
            marksOFsubject3[i] = input.nextInt();

            total[i] = marksOFsubject1[i] + marksOFsubject2[i] + marksOFsubject3[i];
            average[i] = total[i] / 3.0;

            input.nextLine(); // buffer clear again for next student
        }

        System.out.println("\n===== STUDENT REPORT CARD =====");
        for(int i=0;i<n;i++) {
            System.out.println("Name: " + names[i]);
            System.out.println("Total: " + total[i]);
            System.out.println("Average: " + average[i]);

            if(average[i] >= 40) {
                System.out.println("Result: Pass");
            } else {
                System.out.println("Result: Fail");
            }
            System.out.println("-------------------------");
        }

        input.close();
    }
}