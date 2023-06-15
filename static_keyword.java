public class static_keyword {
    
    public static void main (String[] args) {

    // static = modifier. A single copy of variable/methode is created and shared.
    //          The class "owns" a static member.

    Friends friend1 = new Friends("Spongebob");
    Friends friend2 = new Friends("Patrick");
    Friends friend3 = new Friends("Sqidward");
    Friends friend4 = new Friends("Sandy");

    Friends.displayFriends();

    }

}
