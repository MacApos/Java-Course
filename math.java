import java.util.Scanner;

public class math {

    public static void main(String[] args) {

        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter side a:");
        a = scanner.nextDouble();
        
        System.out.println("Enter side b:");
        b = scanner.nextDouble();

        c = Math.sqrt((Math.pow(a ,2)+Math.pow(b ,2)));
        System.out.println("The hypotenus is: " + c);

        scanner.close();

    }

}