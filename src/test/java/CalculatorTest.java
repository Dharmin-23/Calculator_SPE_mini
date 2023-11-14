import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.example.Main;

public class CalculatorTest {

    @Test
    public void power() {
        int expectedAnswer = 32;
        int base = 2;
        int power = 5;
        int answer = Main.power(2, 5);
        Assert.assertEquals(answer, expectedAnswer, 0.0001);
    }

    @Test
    public void elog() {
        double expectedAnswer = 0;
        int n = 1;
        double answer = Main.elog(n);
        Assert.assertEquals(answer, expectedAnswer, 0.001);
    }

    @Test
    public void gcd() {
        int expectedAnswer = 5;
        int a = 10;
        int b = 15;
        int answer = Main.gcd(a, b);
        Assert.assertEquals(answer, expectedAnswer, 0.0001);
    }
}