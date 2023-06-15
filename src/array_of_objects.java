public class array_of_objects {
    public static void main(String [] args) {
        
        Food food1 = new Food("pizza");
        Food food2 = new Food("hot-dog");
        Food food3 = new Food("sandwich");

        Food[] refrigerator = {food1, food2, food3};

        // Food[] refrigerator = new Food[3];

        // refrigerator[0] = food1;
        // refrigerator[1] = food2;
        // refrigerator[2] = food3;

        System.out.println(refrigerator[2]);

    }
}
