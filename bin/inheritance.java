public class inheritance {
    public static void main(String[] args) {
        Cars car = new Cars();
        Bicycles bike = new Bicycles();
    
        car.go();
        bike.stop();

        System.out.println(car.doors);
        System.out.println(bike.pedals);
    
    }
        
}
