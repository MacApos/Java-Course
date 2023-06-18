public class Fish implements Prey, Hunter{
    public void flee(){
        System.out.println("Fish runs away from bigger fish");
    }

    public void hunt(){
        System.out.println("Fish eats smaller fish");
        
    }
}
