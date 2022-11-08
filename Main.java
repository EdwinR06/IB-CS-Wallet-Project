public class Main {
    public static void main(String[] args){
        Wallet myWallet = new Wallet("Josh");
        Transaction t1 = new Transaction(10,"first deposit!");
        Transaction t2 = new Transaction(50);
        Transaction t3 = new Transaction(-40,"buy dinner");
        Transaction t4 = new Transaction(-20,"buy breakfast");
        Transaction t5 = new Transaction(-5,"buy coffee");
        Transaction t6 = new Transaction(20,"Top Up Account");
        myWallet.addTransaction(t1);
        myWallet.addTransaction(t2);
        myWallet.addTransaction(t3);
        myWallet.addTransaction(t4);
        myWallet.addTransaction(t5);
        myWallet.addTransaction(t6);

        myWallet.printBalance();

        myWallet.printHistory();
    }
}
