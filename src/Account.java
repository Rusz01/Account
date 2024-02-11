import java.util.Date;

public class Account {
    // Private data fields
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dataCreated;

    // No-arg constructor
    public Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dataCreated = new Date();
    }

    // Constructor with specified id and initial balance
    public Account(int newId, double newBalance) {
        id = newId;
        balance = newBalance;
        annualInterestRate = 0;
        dataCreated = new Date();
    }

    // Accessor and mutator methods
    public int getId() {
        return id;
    }

    public void setId(int newId) {
        id = newId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newbalance) {
        balance = newbalance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }
    // Accessor method for dateCreated

    public Date getDataCreated() {
        return dataCreated;
    }
    //Method to calculate monthly interest rate
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }
    // Method to withdraw specified amount from account
    public void withdraw(double amount) {
        balance -= amount;
    }
    //Method to deposit specified amount to account
    public void deposit(double amount) {
        balance += amount;
    }
    // main method to display account details
    public static void main(String[] args) {
        // Create new Account object with specified id and balance
        Account account = new Account( 1122, 20000);
        account.setAnnualInterestRate( 0.045); // Set annual interest rate to 4.5%

        // Withdraw $3,000
        account.withdraw( 2500);
        // Deposit $8,000
        account.deposit( 3000);

        // Print account ID , balance , monthly interest ,and date created
        System.out.println("Account Id : " + account.getId());
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Monthly Interest: $" + (account.getMonthlyInterestRate() * account.getBalance()));
        System.out.println("Date Created: " + account.getDataCreated());


    }
}




