public class switcher {
    public static void main(String[] args) {
    
        // switch = statement that allows variable to best tested for equality against a list of values

        String day = "day";

        switch (day) {
            case "Monday":
                System.out.println("It is Monday.");
                break;

            case "Tuesday":
                System.out.println("It is Tuesday.");
                break;

            case "Wednesday":
                System.out.println("It is Wednesday.");
                break;

            case "Thursday":
                System.out.println("It is Wednesday.");
                break;

            case "Friday":
                System.out.println("It is Wednesday.");
                break;

            case "Sunday":
                System.out.println("It is Wednesday.");
                break;

            case "Saturday":
                System.out.println("It is Wednesday.");
                break;
        
            default: 
                System.out.println("This is not a day, dumbass!");
                break;
        }
    
    }

}
