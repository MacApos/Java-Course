public class arrays {
    
    public static void main(String[] args) {
        String[] plants = {"tree", "flower", "grass"};
        System.out.println(plants[2]);

        
        String[] cars = new String[3];

        cars[0] = "Mustang";
        cars[1] = "Corvette";
        cars[2] = "Tesla";

        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }

    }

}
