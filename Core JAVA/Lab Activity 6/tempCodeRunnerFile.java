import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient balance. Cannot withdraw " + amount);
        } else if (amount <= 0) {
            throw new Exception("Invalid withdrawal amount.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class BankingApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double initialBalance = 0;
        
        System.out.print("Enter initial balance: ");
        if (input.hasNextDouble()) {
            initialBalance = input.nextDouble();
        } else {
            System.out.println("Invalid input. Please enter a valid number.");
            input.next(); // Clear invalid input
            return;
        }
        
        BankAccount account = new BankAccount(initialBalance);
        
        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            System.out.print("Choose an option: ");
            if (!input.hasNextInt()) {
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                input.next(); // Clear invalid input
                continue;
            }
            int choice = input.nextInt();
            
            try {
                if (choice == 1) {
                    System.out.print("Enter deposit amount: ");
                    if (!input.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a valid number.");
                        input.next();
                        continue;
                    }
                    double amount = input.nextDouble();
                    account.deposit(amount);
                } else if (choice == 2) {
                    System.out.print("Enter withdrawal amount: ");
                    if (!input.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a valid number.");
                        input.next();
                        continue;
                    }
                    double amount = input.nextDouble();
                    account.withdraw(amount);
                } else if (choice == 3) {
                    System.out.println("Current balance: " + account.getBalance());
                } else if (choice == 4) {
                    System.out.println("Thank you for using the banking application.");
                    break;
                } else {
                    System.out.println("Invalid choice. Try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        
        input.close();
    }
}
