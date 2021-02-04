package udemeychallengeclasses;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this(12345, 00.0, "Tim Brown", "tim.Brown@gmail.com", "07410451649");
        System.out.println("empty constructor called.");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumer) {
        System.out.println("Account constructor with paramaters called ");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    public void deposit(double depositAmount) {

        this.balance += depositAmount;
        System.out.println(" you have deposited £" + depositAmount + " into your bank acount");
        System.out.println("you now have £" + balance + " in your bank account");

    }

    public void withdrawal(double withdrawalAmount) {
        if (balance - withdrawalAmount >= 0) {
            System.out.println("you have enough money to carry out this transaction");
            this.balance -= withdrawalAmount;
            System.out.println("you have withdrawn £" + withdrawalAmount + "  " + " you now have £" + balance + " left.");
        } else {
            System.out.println("Sorry you do not have enough money to carry out this transaction. You only have £" + balance + " left");
        }

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
