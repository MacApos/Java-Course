/* Copy objects
 */

public class copy_objects {
    
    public static void main(String[] args) {
        
        Car4 car1 = new Car4("Chevrolet", "Camaro", 2021);
        Car4 car2 = new Car4(car1);
        car2.copy(car1);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getName());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getName());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());

    }
}
