import java.util.Scanner;

public class birthMonth {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int birthMonth = 0;
        String trash = "";

        System.out.println("Enter your birth month: ");
        if(console.hasNextInt())
        {
            birthMonth = console.nextInt();
            console.nextLine();
            if(birthMonth >= 1 && birthMonth <= 12)
            {
                System.out.println("Your birth month is " + birthMonth);
            }
            else
            {
                System.out.println("Your birth month is out of range. Please try again.");
            }
        }


        else
        {
            trash = console.nextLine();
            System.out.println("Invalid birth month: " + birthMonth);
            System.out.println("Please enter a valid month: ");

        }




















    }
}