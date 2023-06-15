public class methodes {
    public static void main(String[] args) {

        String name = "Jeff";
        int age = 85;

        // methode(argument)
        // void = doesen't return value
        hello(name, age);

        int x = 3;
        int y = 4;

        System.out.println(add(x, y));

    }

    // void methode(parameters)
    // arguemnts and parameters doesen't have to match
    static void hello(String name, int age) {
        System.out.println("Your name is " + name);
        System.out.println("You are " + age + " years old.");
    }

    static int add(int x, int y) {
        
        int z = x +y;
        
        return z;
    }

}
