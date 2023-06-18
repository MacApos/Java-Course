/* Polymorphism =   ability of object to identify as more than one data type.
 */

public class polymorphism {
    public static void main(String[] args) {
        Car5 car = new Car5();
        Bicycle2 bicycle = new Bicycle2();
        Boat boat = new Boat();

        Vehicles3 [] racers = {car, bicycle, boat};

        for(Vehicles3 x: racers){
            x.go();
        }
    }
}
