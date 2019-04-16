import java.util.Scanner;

public class arithmetic
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        int num1;

        int num2;

        int sum;

        int product;

        int difference;

        int quotient;


        System.out.print("Enter the first number: ");
        num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        num2 = input.nextInt();

        sum = num1 + num2;

        product = num1 * num2;

        difference = num1 - num2;

        quotient = num1 / num2;

        System.out.printf("The sum is %d%n", sum);

        System.out.printf("The product is %d%n", product);

        System.out.printf("The difference is %d%n", difference);

        System.out.printf("The quotien is %d%n", quotient);

    }
}