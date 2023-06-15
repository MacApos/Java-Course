import java.util.Scanner;

public class logical_operators {
 
    public static void main(String[] args) {
        // Logical operators
        // && = AND
        // || = OR
        // ! = NOT
        int temp = 27;

        if (temp > 30) {
            System.out.println("It is hot outside.");
        }

        else if (temp >= 25 && temp <= 30) {
            System.out.println("It is warm outside.");
        }

        else {
            System.out.println("It is cold outside.");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press q or Q to quit the game.");


        String option = scanner.next();
        if (option == "q" || option == "Q") {
            System.out.println("You quited the game.");
        }

        else if (!option.equals("q") || !option.equals("")) {
            System.out.println("Continue the game.");
        }
        
        scanner.close();
    }

}
