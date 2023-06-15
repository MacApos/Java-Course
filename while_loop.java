import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {

        // while loop = executes a block of code as long as it's condition remains true

        Scanner scanner = new Scanner(System.in);
        String name = "";
        int age = 0;

        while (name.isBlank()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        do {
            System.out.print("Enter your age: ");
            age = Integer.parseInt(scanner.nextLine());
        }while (name.isBlank());

        System.out.println("Hello " + name + ", you son of a biatch!");
        System.out.println("You are " + age + " years old, you old fuck!");

        scanner.close();
    }
}


