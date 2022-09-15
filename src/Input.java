//NAME - Verlon Amurao
import java.util.Scanner;

public class Input
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        //add more variables, at least 2 of each type:
        //double, float, short, String
        int intOne, intTwo;
        double doubleOne, doubleTwo;
        float floatOne, floatTwo;
        short shortOne, shortTwo;
        String strOne, strTwo;

        System.out.print("Enter an integer :: ");
        intOne = keyboard.nextInt();
        System.out.print("Enter an integer :: ");
        intTwo = keyboard.nextInt();

        System.out.print("Enter a double :: ");
        doubleOne = keyboard.nextDouble();
        System.out.print("Enter another double :: ");
        doubleTwo = keyboard.nextDouble();

        System.out.print("Enter a float :: ");
        floatOne = keyboard.nextFloat();
        System.out.print("Enter a float :: ");
        floatTwo = keyboard.nextFloat();

        System.out.println("Enter a short :: ");
        shortOne = keyboard.nextShort();
        System.out.println("Enter a short :: ");
        shortTwo = keyboard.nextShort();

        keyboard.nextLine();

        System.out.println("Enter a string :: ");
        strOne = keyboard.nextLine();
        System.out.println("Enter a string :: ");
        strTwo = keyboard.nextLine();

        //add in input for all variables

        System.out.println();
        System.out.println("integer one = " + intOne );
        System.out.println("integer two = " + intTwo );
        System.out.println("double one = " + doubleOne );
        System.out.println("double two = " + doubleTwo );
        System.out.println("float one = " + floatOne );
        System.out.println("float two = " + floatTwo );
        System.out.println("short one = " + shortOne );
        System.out.println("short two = " + shortTwo );
        System.out.println("string one = " + strOne );
        System.out.println("string two = " + strTwo );

        //add output for all variables


    }
}