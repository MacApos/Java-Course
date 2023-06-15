/*
 * Reference class, it isn't public.
 * 
 * Default = visible for all classes and subclasses in same package.
 * Private = visible only for class where is declared.
 * Protected = visible for all classes and subclasses in same package and subclasses in different packages.
 * Protected = visible for all classes and subclasses in all packages.
 */

package package1;

class A {
    static String deafultMessage = "This is deafult.";
    private static String privateMessage = "This is private.";
    protected static String protectedMessage = "This is protected.";
    public static String publicMessage = "This is public.";

	public static void main(String[] args) {
        System.out.println(deafultMessage);
        System.out.println(privateMessage);
        System.out.println(protectedMessage);
        System.out.println(publicMessage);    
    }
}
