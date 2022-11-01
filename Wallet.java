import java.util.ArrayList;

public class Wallet {
    private double balance;
    private ArrayList<Transaction> history;
    private String owner;
    private boolean validFlag = false;
    
    public Wallet(String owner){
        this.balance = 0;
        this.history = new ArrayList<Transaction>();
        this.owner = owner;
    }

    public double getBalance() {
        return this.balance;
    }

    public boolean validateTransaction(Transaction transaction) {
        if(transaction.getAmount() != 0 && transaction.getAmount() + this.balance >= 0) {
            validFlag = true;
        }
        return validFlag;
    }

}