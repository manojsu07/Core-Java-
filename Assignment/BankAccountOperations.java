public class BankAccountOperations {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Manoj", 121233, 45000);

        acc1.display();
        acc1.deposit(50000);
        acc1.withDraw(30000);

        BankAccount acc2 = new BankAccount("XYZ", 343434);
        acc2.display();
        acc2.withDraw(500);
    }

    static class BankAccount {
        String accountHolder;
        long accountNumber;
        double balance;

        BankAccount(String name, long accountNumber) {
            this.accountHolder = name;
            this.accountNumber = accountNumber;
            balance = 0;
        }

        void display() {
            System.out.println("Name of the Account holder: " + accountHolder);
            System.out.println("Account number: " + accountNumber);
            System.out.println("Balance: " + balance);
        }

        BankAccount(String name, long accountNumber, double balance) {
            accountHolder = name;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        void deposit(int amount) {
            balance = balance + amount;
            System.out.println("\nDeposited Succusfully !");
            System.out.println("Total Balance : " + balance);
        }

        void withDraw(int amount) {
            if (balance <= 0) {
                System.out.println("Balance is Insufficient");
            } else {
                System.out.println("\nCollect your cash!");
                balance -= amount;
                System.out.println("Avalable balance: " + balance);
            }

        }
    }
}
