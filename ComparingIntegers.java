import java.util.Scanner;

public class ComparingIntegers
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);


        int number1;
        int number2;


        System.out.print("Enter first number: ");
        number1 = input.nextInt();

        System.out.print("Enter second number: ");
        number2 = input.nextInt();

        if (number1 > number2 )
        {

            System.out.printf("%d is larger", number1);

        }

        if (number2 > number1 )
        {

            System.out.printf("%d is larger%n", number2);

        }

        if ( number1 == number2 )

        {

            System.out.printf("The numbers entered are equal%n");

        }
    }
}