import java.util.Scanner;

public class Multiple
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner( System.in);

        int num1;
        int num2;

        System.out.print("Enter first integer: ");
        num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        num2 = input.nextInt();

        if ( num1 % num2 == 0 )
        {

            System.out.printf("%d is a multiple of %d%n", num1, num2);

        }

        else
        {
            
            System.out.printf("%d is NOT a multiple of %d%n", num1, num2);

        }
    }
}