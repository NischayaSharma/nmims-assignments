import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

class Fibbonacci {
    static int fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number not generated");
        } else if (n < 2) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}

public class MainQ6 {
    @Test
    public void testfib() {
        Assert.assertEquals(13, Fibbonacci.fib(7));
    }

    @Test
    public void testFibMinusOne() {
        boolean caught = false;
        try {
            Fibbonacci.fib(-1);
        } catch (IllegalArgumentException e) {
            caught = true;
        }
        assertTrue(caught);
    }

    public void testFib2() {
        assertEquals(1, Fibbonacci.fib(2));
    }
}