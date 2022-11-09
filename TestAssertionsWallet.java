import org.junit.Test;

import static org.junit.Assert.*;
public class TestAssertionsWallet {
    @Test
    public void testAssertionsWallet() {
        Transaction transaction = new Transaction(15, "first");
        Wallet myWallet = new Wallet("bob");

        final double expectedBalance = 0;
        final double resultBalance = myWallet.getBalance();
        assertEquals(expectedBalance, resultBalance, .01);

        myWallet.addTransaction(transaction);
        final double expectedBalance1 = 15;
        final double resultBalance1 = myWallet.getBalance();
        assertEquals(expectedBalance1, resultBalance1, 0.01);
        
        final String expectedOwner = "bob";
        final String resultOwner = myWallet.getOwner();
        assertEquals(expectedOwner, resultOwner);

        Transaction transaction1 = new Transaction(-25);
        final boolean expectedValid = false;
        final boolean resultValid = myWallet.validateTransaction(transaction1);
        assertEquals(expectedValid, resultValid);

        Transaction transaction2 = new Transaction(15);
        final boolean expectedAdd = true;
        final boolean resultAdd = myWallet.addTransaction(transaction2);
        assertEquals(expectedAdd, resultAdd);

    }
}
