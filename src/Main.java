import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        final double FREE_SHIP = 100;
        double totalCost = 0;
        double itemPrice = 0;
        double shipCost = 0;
        final double SHIP_RATE = 0.2;
        String trash = "";
        Scanner in = new Scanner(System.in);


        System.out.print("Enter the item price ");
        if(in.hasNextDouble())
        {
            itemPrice = in.nextDouble();
            in.nextLine(); //clears the buffer, need to do that when reading numbers

            if(itemPrice >= FREE_SHIP)
            {
                shipCost = 0;
                totalCost = itemPrice;
            }
            else
            {
                shipCost = itemPrice * SHIP_RATE;
                totalCost = itemPrice + shipCost;
            }

            System.out.println("Shipping Costs are: " + shipCost);
            System.out.println("Total Cost are: " + totalCost);



        }
        else
        {
            trash = in.nextLine();
            System.out.println("Please enter the item price not " + trash);
            System.out.println("Please run the program again");
        }













    }
}