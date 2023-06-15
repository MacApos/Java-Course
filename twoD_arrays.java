public class twoD_arrays {
    public static void main(String[] args) {
        String[][] cars = {
            {"Camaro", "Corvette", "Silverado"},
            {"Mustang", "Ferrari", "F-150"},
            {"Ranger", "Lambo", "Tesla"}
        }; 

        for (int i=0; i<cars.length; i++){
            System.out.println();
            
            for (int j=0; j<cars[i].length; j++){
                System.out.print(cars[i][j]+"\t");

            }

        }

    }
}