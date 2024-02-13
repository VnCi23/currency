import java.util.Scanner;

public class ATMExample {
    public static void main(String[] args) {
        int balance = 100000; // Initial balance
        int withdraw, deposit; // Variables for withdrawal and deposit
        Scanner sc = new Scanner(System.in); // Scanner for user input

        while (true) {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform: ");

            int choice = sc.nextInt(); // Get user's choice

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to be withdrawn: ");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw) {
                        balance -= withdraw;
                        System.out.println("Please collect your money.");
                    } else {
                        System.out.println("Insufficient Balance.");
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to be deposited: ");
                    deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println("Your money has been successfully deposited.");
                    break;

                case 3:
                    System.out.println("Balance: " + balance);
                    break;

                case 4:
                    System.exit(0); // Exit the program
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
