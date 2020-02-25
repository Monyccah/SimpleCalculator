
public class Calculator {


    public static void main(String[] args) {
        int multiSum = addMultiple(1,2,3,4);
        System.out.println(multiSum);
        int answer = multiply(10,2);
        System.out.println(answer);
        int multianswer= moreMultiple(5,6,7,8,9);
        int sum = add(1,2);
        System.out.println(sum);System.out.println(multianswer);
    }
    public static int add(int a, int b)
    {        return a + b;    }

    public static int addMultiple(int...x)
    {        int sum = 0;
        for (int i = 0; i <x.length ; i++)
        {            sum += x[i];        }
        return sum;    }

    public static int multiply(int num1, int num2)
    {        return num1 * num2;    }

    public static int moreMultiple(double...y)
    {        int count = 1;
        for (int i = 0; i < y.length ; i++)
        {            count *= y[i];        }
        return count;    }
}



