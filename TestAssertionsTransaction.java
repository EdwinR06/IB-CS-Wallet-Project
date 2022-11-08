import org.junit.Test;

import static org.junit.Assert.*;

import java.beans.Transient;
public class TestAssertionsTransaction {
    @Test
    public void testAssertionsTransaction() {
        Transaction transaction = new Transaction(15, "first");
        Transaction transaction1 = new Transaction(5);

        final double expectedAmount1 = 15;
        final double resultAmount1 = transaction.getAmount();
        assertEquals(expectedAmount1, resultAmount1, .01);

        final String expectedString1 = "first";
        final String resultString1 = transaction.getNote();
        assertEquals(expectedString1, resultString1);

        final String expectedString2 = "No note added";
        final String resultString2 = transaction1.getNote();
        assertEquals(expectedString2, resultString2);

    }
}
