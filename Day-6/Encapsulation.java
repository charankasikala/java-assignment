public class Encapsulation {
    private String transactionId;
    private String payerName;
    private String payeeName;
    private double amount;
    private String paymentMethod;
    private String transactionStatus;
	
    public Encapsulation(String transactionId, String payerName, String payeeName, double amount, String paymentMethod, String transactionStatus){
        this.transactionId = transactionId;
        this.payerName = payerName;
        this.payeeName = payeeName;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.transactionStatus = transactionStatus;

    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
    public String getTransactionId() {
        return transactionId;
    }
    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }
    public String getPayerName() {
        return payerName;
    }
    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }
    public String getPayeeName() {
        return payeeName;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public String getPaymentMethod() {
        return paymentMethod;
    }
    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }
    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void displayTransactionSummary() {
        System.out.println("Transaction Summary:");
        System.out.println("Transaction ID: " + getTransactionId());
        System.out.println("Payer Name: " + getPayerName());
        System.out.println("Payee Name: " + getPayeeName());
        System.out.println("Amount: " + getAmount());
        System.out.println("Payment Method: " + getPaymentMethod());
        System.out.println("Transaction Status: " + getTransactionStatus());
        System.out.println();
    }
    public static void main(String[] args) {
        Encapsulation mainObj = new Encapsulation("TXN12647", "CHARAN", "HARISH", 20000, "UPI/NEFT", "SUCCESS");
        mainObj.displayTransactionSummary();
        mainObj.setAmount(30000);
        mainObj.displayTransactionSummary();
    }
}