public class string_methode {
    public static void main(String[] args) {

        String name = "Jeff";

        String lower = name.toLowerCase();
        System.out.println(lower);

        String upper = name.toUpperCase();
        System.out.println(upper);

        boolean equal = name.equals(upper);
        System.out.println(equal);

        boolean equal_ignore = name.equalsIgnoreCase(upper);
        System.out.println(equal_ignore);

        int len = name.length();
        System.out.println(len);
        
        char ch = name.charAt(1);
        System.out.println(ch);

        int idx = name.indexOf(ch);
        System.out.println(idx);

        boolean empty = name.isEmpty();
        System.out.println(empty);

        String trimmed = name.trim();
        System.out.println(trimmed);

        String replaced = name.replace("e", "a");
        System.out.println(replaced);
        

    }
}
