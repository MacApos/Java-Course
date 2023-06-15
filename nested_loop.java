import java.util.Scanner;

public class nested_loop {
    public static void main(String[] args) {
        int rows;
        int columns;
        String symbol;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter numbers of rows: ");
        rows = scanner.nextInt();

        System.out.println("Enter numbers of columns: ");
        columns = scanner.nextInt();
        symbol = scanner.nextLine();

        System.out.println("Enter your symbol: ");
        symbol = scanner.nextLine();

        for (int i = 1; i <= rows; i++) {
            System.out.println();

            for (int j = 1; j <= columns; j++) {
                System.out.print(symbol);    
            }
            
        }

        scanner.close();

    }
}
