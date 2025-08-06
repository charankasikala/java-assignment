import java.util.ArrayList;

class Account {
    int accountNumber;
    String holderName;
    Double balance; 

    public Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance; 
    }
}

public class Problem8 {
    public static void main(String[] args) {

        double rate = 5.0;
        Double interestRate = Double.valueOf(rate); 

        ArrayList<Account> accountList = new ArrayList<>();

        accountList.add(new Account(101, "Pankaj", 10000.0));
        accountList.add(new Account(102, "Harish", 20000.0));
        accountList.add(new Account(103, "Vishnu", 15000.0));

        for (Account acc : accountList) {
            System.out.println("=================================");
            System.out.println("Account Holder Name: " + acc.holderName);
            System.out.println("Account Number     : " + acc.accountNumber);
            System.out.println("Original Balance   : " + acc.balance);

            double interest = acc.balance * (interestRate / 100); 
            double newBalance = acc.balance + interest;

            acc.balance = newBalance;
            System.out.println("New Balance (after 5% interest): " + newBalance);
        }

        System.out.println("-------------------------------------");
    }
}
