class BankAccount {

    private String accountNumber;
    private double balance;

    // Constructor to initialize the account
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Setter for account number
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("The deposit amount must be positive!");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0) {
            balance -= amount;
            System.out.println("Withdrawn amount is: $ " + amount);
        } else {
            System.out.println("The amount to withdraw must be positive");
        }
    }

    // Main method to run the program
    public static void main(String[] args) {

        // Create a new BankAccount object
        BankAccount myAccount = new BankAccount("74BVCD45", 307);

        // Deposit money into the account
        myAccount.deposit(700);

        // Display new balance after deposit
        System.out.println("New balance is: $ " + myAccount.getBalance());

        // Withdraw money from the account
        myAccount.withdraw(150);

        // Display new balance after withdrawal
        System.out.println("New balance after withdrawal: $ " + myAccount.getBalance());
    }
}
