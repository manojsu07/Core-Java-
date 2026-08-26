class BankAccount {
    private String accountNum;
    private double baalance = 0;

    public void setAcccountNum(String accNum) {
        if ((accNum != null) && (accNum.length() == 6)) {
            accountNum = accNum;
        } else {
            System.out.println("Invalid account number");
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else {
            baalance += amount;
        }
    }

    public void withdraw(double amount) {
        if (baalance < amount) {
            System.out.println("Insufficient Fund!");
        } else {
            baalance -= amount;
        }
    }

    public double getBalance() {
        return baalance;
    }

    public String getAccNum() {
        return accountNum;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        BankAccount myBankAccount = new BankAccount();

        myBankAccount.setAcccountNum("123456");
        myBankAccount.deposit(1000);

        System.out.println("MY account Number: " + myBankAccount.getAccNum());
        System.out.println("Initial Balance: " + myBankAccount.getBalance());

        myBankAccount.deposit(500);
        System.out.println("After deposit : " + myBankAccount.getBalance());

        myBankAccount.withdraw(200);
        System.out.println("After withdraw : " + myBankAccount.getBalance());

        System.out.println("Final Balance: " + myBankAccount.getBalance());
        System.out.println("Account Number: " + myBankAccount.getAccNum());

    }
}