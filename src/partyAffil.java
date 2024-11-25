import java.util.Scanner;

public class partyAffil {
    public static void main(String[] args)
    {
        String partyAfil = "";
        String trash = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter party R/D/I: ");
        partyAfil = in.nextLine();
        in.nextLine();


        if(partyAfil.equalsIgnoreCase("R"))
        {
            System.out.println("You get a republican donkey!");

        }else if(partyAfil.equalsIgnoreCase("D"))
        {
            System.out.println("You get a democratic donkey!");
        } else if (partyAfil.equalsIgnoreCase("I"))
        {
            System.out.println("You get an Independent Man!");
        }else
        {
            System.out.println("You are entered an improper character. Please try again.!");
        }


    }
}