import java.util.Scanner;

public class theaterKiosk {
    public static void main(String[] args) {
        int age = 0;
        Scanner input = new Scanner(System.in);
        String trash = "";

        System.out.println("Please enter your age: ");
        if (input.hasNextInt()) {
            age = input.nextInt();
            if (age >= 21) {
                System.out.println("You get a wristband!");

            }
        }
    }
}