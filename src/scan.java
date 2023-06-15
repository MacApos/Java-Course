import java.util.Scanner;

// class
public class scan {
    // methode
    public static void main(String[] args) {
        // object

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name, biatch?");
        String name = scanner.nextLine();
        
        System.out.println("How old are you, biatch?");
        int age = scanner.nextInt();
        

        // scanner.nextLine() wykorzystuje \n (enter) jako indykator zakończenia metody, ale scanner.nextInt() nie ma takiej funkcji, dlatego po 
        // naciśnięciu \n przechodzi do kolejnego polecenia, którym w tym przypadku jest drugi scanner.nextLine(), który kończy program bo odczytuje \n, 
        // wciśnięty wcześniej. Trzeba wprowadzić jeszcze jeden scanner.nextLine(), żeby zniwelować dodatkowy \n

        scanner.nextLine();
        System.out.println("What is your favorite food, biatch?");
        String food = scanner.nextLine();

        System.out.println("My name is " + name + " biatch");
        System.out.println("I am " + age + " years old, biatch");
        System.out.println("My favorite food is " + food);

        scanner.close();

    }
}
