public class Calculator {

    public static void main(String[] args) {
        System.out.println(add(1,2,3,4,5));
        System.out.println(add(1,2));
        System.out.println(add(-1,-1));
        System.out.println(multiply(1,2,3,4,5));
        System.out.println(multiply(1,3));
        System.out.println(multiply(-1,3));
    }
    public static int add(int...numbers) {
        int sum = 0;
        for(int x = 0; x < numbers.length; x ++)
        {
            sum = sum + numbers[x];
        }
        return sum;
    }
    public static int multiply(int...numbers) {
        int sum = numbers[0];
        for(int x = 1; x < numbers.length; x++)
        {
            sum = sum * numbers[x];
        }
        return sum;
    }
}