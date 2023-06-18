/*  Encapsulation =  atributes of a class will be private or hidden.
    They can be accesed only through methodes (getters & scatters).
    Atributes should be private if there is no reason to make them public.
 */

public class encapsulation {
    public static void main(String[] args) {

        Car4 car = new Car4("Chevrolet", "Camaro", 2020);

        System.out.println(car.getYear());
        car.setYear(2021);
        System.out.println(car.getYear());

    }
    
}
