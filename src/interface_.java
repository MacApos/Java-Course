/* Interface =  template that can be applied to the class.
 * Similar to inheritance, but specifies what a class has/must do.
 * Class can apply more than one interface, inheritance is limited to one super.
 */

public class interface_{
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();

        hawk.hunt();

        fish.flee();
        fish.hunt();

    }
}