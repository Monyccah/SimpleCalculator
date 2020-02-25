import org.junit.Assert;
import org.junit.Test;

public class SimpleCalculatorTest {

    public static int add(int a, int b)
    {        return a + b;    }

    @Test
    public void addTest() {

        Assert.assertEquals(add(1,5),6);
    }

    public static int addMultiple(int...x)
    {        int sum = 0;
        for (int i = 0; i <x.length ; i++)
        {            sum += x[i];        }
        return sum;    }

    @Test
    public void addMultipleTest() {

        Assert.assertEquals(addMultiple(2,3,3),8);
    }

    public static int multiply(int num1, int num2)   {
        return num1 * num2;    }

    @Test
    public void MultiplyTest() {

        Assert.assertEquals(multiply(3,3),9);
    }
    public static int moreMultiple(double...y)
    {        int count = 1;
        for (int i = 0; i < y.length ; i++)
        {            count *= y[i];        }
        return count;    }
    @Test
    public void moreMultipleTest() {

        Assert.assertEquals(moreMultiple(2,2,2),8);
    }
}
