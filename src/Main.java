import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double tempC = 0;
        String trash = "";
        System.out.println("Enter Temperature in C: ");

        if(in.hasNextDouble())
        {
            tempC = in.nextDouble();
            double tempF = (tempC * 1.8) + 32;
            System.out.println("Temperature in F is: " + tempF);

        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a number. Try again.");
        }


    }
}