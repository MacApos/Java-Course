public class Friends {
    String name;
    static int numberOffFriends;

    Friends(String name) {
        this.name = name;
        numberOffFriends ++;
    }

    static void displayFriends() {
        System.out.println("You have " + numberOffFriends + " friends.");
    }

}
