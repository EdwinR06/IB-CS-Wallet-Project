import java.util.ArrayList;

public class Wallet {
    private double balance;
    private ArrayList<Transaction> history;
    private String owner;
    
    public Wallet(String owner){
        this.balance = 0;
        this.history = new ArrayList<Transaction>();
        this.owner = owner;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getOwner() {
        return this.owner;
    }

    private boolean validateTransaction(Transaction transaction) {
        boolean validFlag = false;
        if(transaction.getAmount() != 0 && transaction.getAmount() + this.balance >= 0) {
            validFlag = true;
        }
        return validFlag;
    }

    public boolean addTransaction(Transaction transaction) {
        boolean addTrans = false;
        if(validateTransaction(transaction) == true) {
            this.history.add(transaction);
            this.balance += transaction.getAmount();
            addTrans = true;
        }
        return addTrans;
    }

    public void printHistory() {
        System.out.println(this.owner + "'s Transactions\n");

        for (int i = 0; i < this.history.size(); i++) {
            System.out.println("Transaction " + (i+1));
            System.out.println("Amount: $" + this.history.get(i).getAmount());
            System.out.println("Note: " + this.history.get(i).getNote());
            System.out.println("");
        }
    }
    
    public void printBalance(){
        System.out.println(this.getBalance());
    }
}