/*
 * Same package as A, non-subclass
 */

package package1;

public class B {

    protected static String protectedMessage = A.protectedMessage;
    public static String publicMessage = A.publicMessage;

    public static void main(String[] args) {
        System.out.println(A.deafultMessage);
        System.out.println(A.protectedMessage);
        System.out.println(A.publicMessage);
    }  
}
