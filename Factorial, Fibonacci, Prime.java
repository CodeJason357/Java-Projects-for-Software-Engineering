import java.util.Scanner;

public class Main {

    // Fibonacci Method
    static void fibonacci(int limit, Scanner input) {
        int[] arr = new int[limit];

        // প্রথম 2 সংখ্যা ইউজার দেবে
        for (int i = 0; i < 2; i++) {
            System.out.print("Enter " + (i + 1) + " Number > ");
            arr[i] = input.nextInt();
        }

        // পরের সংখ্যা বের করা
        for (int i = 2; i < limit; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        System.out.println("Fibonacci Numbers > ");
        for (int i = 0; i < limit; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Factorial Method
    static void factorial(int num) {
        int factorial = 1;
        if (num >= 0) {
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("Factorial = " + factorial);
        } else {
            System.out.println("Factorial is not defined for negative numbers.");
        }
    }

    // Prime Number Generator Method
    static void prime(int limit) {
        int count = 0, num = 2; // প্রথম prime শুরু হবে 2 থেকে
        System.out.println("Prime Numbers > ");
        while (count < limit) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }

    // Helper Method -> Prime Check
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Main Method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nWelcome To Factorial, Prime And Fibonacci Number Generator.");
            System.out.println("1. Generate Factorial.");
            System.out.println("2. Generate Fibonacci.");
            System.out.println("3. Generate Prime.");
            System.out.println("4. Exit.");
            System.out.print("Enter Choice Between(1-4) > ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number for Factorial = ");
                    int num = input.nextInt();
                    factorial(num);
                    break;

                case 2:
                    System.out.print("Enter how many Fibonacci numbers you want to generate = ");
                    int lim = input.nextInt();
                    fibonacci(lim, input);
                    break;

                case 3:
                    System.out.print("Enter how many Prime numbers you want to generate = ");
                    int limit = input.nextInt();
                    prime(limit);
                    break;

                case 4:
                    System.out.println("Exiting Program....");
                    input.close();
                    return; // exit the program

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }
        }
    }
}