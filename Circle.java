import java.util.Scanner;

public class Circle
{

    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);

        int radius;

        int diameter;

        double circumferance;

        double area;

        System.out.print("Enter radius of a circle ");

        radius = input.nextInt();

        System.out.printf("The diameter is %d%n", radius *2);

        System.out.printf("The circumferance is %.2f%n", 2*Math.PI*radius);

        System.out.printf("The area is %.2f%n", Math.PI*radius*radius);

    }
}