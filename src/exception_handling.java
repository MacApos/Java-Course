/* Exception =  event that occurs during the execution of program that,
 *              disrupts the normal flow of instruction.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class exception_handling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Number to divide by: ");
            int y = scanner.nextInt();

            int z = x/y;
            System.out.println("Result: " + z); 
        } 
        
        catch (ArithmeticException e) {
            System.out.println("Can't divide by zero.");
        }
        
        catch (InputMismatchException e) {
            System.out.println("This is not a number.");
        }

        catch (Exception e) {
            System.out.println("Something went wrong.");
        }

        finally {
            scanner.close();
            System.out.println("This will always print.");
        }
    }
}
