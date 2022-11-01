public class Transaction {
    private double amount;
    private String note;

    public Transaction(double amount, String note) {
        this.amount = amount;
        this.note = note;
    }

    public double getAmount() {
        return this.amount;
    }

    public String getNote(){
        return this.note;
    }
}
