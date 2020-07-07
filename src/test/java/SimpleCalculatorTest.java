import org.junit.Assert;
import org.junit.Test;
public class SimpleCalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void addTest() {
        Assert.assertEquals(calculator.add(1, 2, 3, 4, 5), 15);
        Assert.assertEquals(calculator.add(1, 2), 3);
        Assert.assertEquals(calculator.add(-1, -1), -2);
    }

    @Test
    public void multipleTest() {
        Assert.assertEquals(calculator.multiply(1, 2, 3, 4, 5), 120);
        Assert.assertEquals(calculator.multiply(1, 3), 3);
        Assert.assertEquals(calculator.multiply(-1, 3), -3);
    }
}