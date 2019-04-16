import java.util.Scanner;

public class BodyMass
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        int weight;

        int height;

        double bmi;

        System.out.println("Enter weight in pounds: ");
        weight = input.nextInt();

        System.out.println("Enter height in inches: ");
        height = input.nextInt();

        bmi = ( weight * 703 ) / ( height * height );

        System.out.printf("Based on the information entered, your BMI is %.1f%n", bmi);

        System.out.println();

        System.out.println("**********************************************************");

        System.out.println("BMI VALUE");

        System.out.println("Underweight: less than 18.5");

        System.out.println("Normal: between 18.5 and 24.9");

        System.out.println("Overweight: between  25 and 29.9");

        System.out.println("30 or greater");

        System.out.println("*********************************************************");
    }
}