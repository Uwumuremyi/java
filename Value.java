import java.util.Scanner;

public class Value
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        int number1;

        int number2;

        int number3;

        int number4;

        int number5;


        int zeros = 0;

        int negatives = 0;

        int positives = 0;


        System.out.println("Enter first number: ");
        number1 = input.nextInt();

        System.out.println("Enter second number: ");
        number2 = input.nextInt();

        System.out.println("Enter 3rd number: ");
        number3 = input.nextInt();

        System.out.println("Enter 4th number: ");
        number4 = input.nextInt();

        System.out.println("Enter 5th number: ");
        number5 = input.nextInt();

        if (number1 < 0 )
        {

            negatives++;

        }

        if ( number1 == 0 )

        {

            zeros++;
        }
        
        if ( number1 > 0 )
        {

            positives++;

        }

        /**************************** */

        if (number2 < 0 )
        {

            negatives++;

        }

        if ( number2 == 0 )

        {

            zeros++;
        }
        
        if ( number2 > 0 )
        {

            positives++;

        }

        /****************************** */

        if (number3 < 0 )
        {

            negatives++;

        }

        if ( number3 == 0 )

        {

            zeros++;
        }
        
        if ( number3 > 0 )
        {

            positives++;

        }

        /************************ */

        if (number4 < 0 )
        {

            negatives++;

        }

        if ( number4 == 0 )

        {

            zeros++;
        }
        
        if ( number4 > 0 )
        {

            positives++;

        }

        /*********************** */

        if (number5 < 0 )
        {

            negatives++;

        }

        if ( number5 == 0 )

        {

            zeros++;
        }
        
        if ( number5 > 0 )
        {

            positives++;

        }

        System.out.printf("The number of negatives is %d%n", negatives);

        System.out.printf("The number of zeros is %d%n", zeros);

        System.out.printf("The number of positives is %d%n", positives);


    }
}