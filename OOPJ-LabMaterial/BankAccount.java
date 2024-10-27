import java.util.Scanner;

class Account {
    private double balance;

    public Account(double initialBalance) 
    {
        if (initialBalance < 5000) 
        {
            System.out.println("Initial balance cannot be less than 5000. Setting balance to 5000.");
            balance = 5000;
        } 
        else 
        {
            balance = initialBalance;
        }
    }

    public void deposit(double amount) 
    {
        if (amount <= 0) 
        {
            System.out.println("Invalid deposit amount. Amount must be greater than 0.");
            return;
        }
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
    }

    public void withdraw(double amount) 
    {
        if (amount <= 0) 
        {
            System.out.println("Invalid withdrawal amount. Amount must be greater than 0.");
            return;
        }
        if (balance - amount < 5000) 
        {
            System.out.println("Insufficient funds. Withdrawal not allowed.");
        } 
        else 
        {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        }
    }

    public void displayBalance() 
    {
        System.out.println("Current balance: " + balance);
    }
}

public class Main 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account(5000);

        while (true) 
        {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
