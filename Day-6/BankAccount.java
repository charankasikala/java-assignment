public class BankAccount {
    private long accountNumber;
    private String accountHolderName;
    private double balance;

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public long getAccountNumber() {
        return accountNumber;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if(amount > 0){
            balance += amount;
            System.out.println("₹" + amount + " Deposit successful.");
        }
        else{
            System.out.println("Deposit Amount cannot be negative");
        }
    }
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        }
        else{
            System.out.println("Cannot Withdraw: Insufficient funds or amount cannot be negative");
        }
    }
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(123456789);
        bankAccount.setAccountHolderName("PANKAJ");
        bankAccount.setBalance(1000);
        bankAccount.deposit(1000);
        bankAccount.withdraw(700);
        System.out.println("Account Number: " + bankAccount.getAccountNumber());
        System.out.println("Account Holder Name: " + bankAccount.getAccountHolderName());
        System.out.println("Balance: " + bankAccount.getBalance());
    }
}