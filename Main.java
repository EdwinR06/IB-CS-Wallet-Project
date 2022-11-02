public class Main {
    public static void main(String[] args){
        Wallet myWallet = new Wallet("Edwin");
        Transaction tx = new Transaction(1, "initial deposit");
        Transaction tx1 = new Transaction(-2, "buy donut");
        myWallet.addTransaction(tx);
        myWallet.addTransaction(tx1);
        myWallet.printHistory();


    }
}
