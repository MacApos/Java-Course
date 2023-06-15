import java.util.ArrayList;

public class for_each_loop {
    public static void main(String[] args) {
        // for = exceut a block limited amount of time

        // String[] animals = {"dog", "cat", "turtle", "bird"};
        ArrayList<String> animals = new ArrayList<>();

        animals.add("dog");
        animals.add("cat");
        animals.add("turtle");
        animals.add("bird");

        //  : = in
        for (String i : animals) {
            System.out.println(i);
        }

        // System.out.println("Happy new year, biatches!");

    }
}
