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
}