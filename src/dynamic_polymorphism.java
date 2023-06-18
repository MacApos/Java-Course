/* Dynamic =    perform after compilation.
 */

import java.util.Scanner;

public class dynamic_polymorphism {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("Choose your warrior: \n 1-dog \t 2-cat");
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            animal = new Dog();
        }

        else if (choice == 2) {
            animal = new Cat();
        }

        else {
            animal = new Animal();
        }

        animal.speak();
    }
}
