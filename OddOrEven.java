 import java.util.Scanner;

 public class OddOrEven
 {

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        int number;

        System.out.println("Enter a number and I will tell you if it is odd or even");

        number = input.nextInt();

        if ( number % 2 == 0 )
        {

            System.out.println("The number you entered is even.");

        }

        else
        {

            System.out.println("The number you entered is odd");
            
        }

    }
 }