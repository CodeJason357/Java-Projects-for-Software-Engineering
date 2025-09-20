import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Digital ATM");
        int set_pin=456789,choice,input_pin;
        float balance=0.0f, dep_amount,withd_amount;
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Change Pin");
        System.out.println("5. Exit");
        System.out.println("Enter Choice Between(1-5) > ");
        choice = input.nextInt();
        switch(choice) {
            case 1:
                System.out.print("Enter your pin = ");
                input_pin = input.nextInt();
            if(set_pin == input_pin) {
                System.out.println("Correct Pin");
                System.out.print("Enter amount of money you want to deposit = ");
                dep_amount = input.nextFloat();
                balance = balance + dep_amount;
                System.out.println("Successfully Deposited! New Balance = " + balance);
            }
            else {
                    System.out.print("Incorrect Pin...., try again");
                }
                break;
            case 2:
                System.out.print("Enter your pin = ");
                input_pin = input.nextInt();
                if(set_pin == input_pin) {
                    System.out.println("Correct Pin");
                    System.out.print("Enter amount of money you want to withdraw = ");
                    withd_amount = input.nextFloat();
                    if(balance >= withd_amount) {
                        balance = balance - withd_amount;
                        System.out.println("Withdraw Successful! New Balance = " + balance);
                    } 
                    else {
                        System.out.println("Insufficient Balance!");
                    }
                }
                    else {
                    System.out.print("Incorrect Pin...., try again");
                }
                break;
            case 3:
                System.out.print("Enter your pin = ");
                input_pin = input.nextInt();
                if(set_pin == input_pin) {
                    System.out.println("Correct Pin");
                    System.out.print("Your Account balance is " + balance);
                }
                else {
                    System.out.print("Incorrect Pin...., try again");
                }
                break;
            case 4:
                System.out.print("Enter your pin = ");
                input_pin = input.nextInt();
                if(set_pin == input_pin) {
                    System.out.println("Correct Pin");
                    System.out.print("Enter new pin you want to set = ");
                    set_pin = input.nextInt();
                }
                else {
                    System.out.print("Incorrect Pin...., try again");
                }
                break;
            case 5:
                System.out.print("Exiting......");
                break;
            default:
                System.out.print("Invalid Choice, Please choice between(1-5)");
        }
        input.close();
    }
}
