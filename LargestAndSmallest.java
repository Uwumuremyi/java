import java.util.Scanner;

public class LargestAndSmallest
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int num4;
        int num5;


        int smallest;
        int largest;


        System.out.print("Enter fist number: ");
        num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        num2 = input.nextInt();

        System.out.print("Enter third integer: ");
        num3 = input.nextInt();

        System.out.print("Enter 4th integer: ");
        num4 = input.nextInt();

        System.out.print("Enter 5th integer: ");
        num5 = input.nextInt();

        
        smallest = num1;

        if (num2 < smallest)
        {

            smallest = num2;

        }

        if (num3 < smallest)
        {

            smallest = num3;

        }

        if (num4 < smallest)
        {

            smallest = num4;

        }

        if (num5 < smallest )
        {

            smallest = num5;

        }

        largest = num1;

        if ( num2 > largest)
        {

            largest = num2;

        }

        if ( num3 > largest)
        {

            largest = num3;

        }

        if (num4 > largest)
        {

            largest = num4;

        }

        if (num5 > largest )
        {

            largest = num5;

        }

        System.out.printf("The smallest of the five is %d%n", smallest);

        System.out.printf("The largest of the five is %d%n", largest);

    }
}