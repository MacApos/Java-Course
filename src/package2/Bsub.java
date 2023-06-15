/*
 * Different package from A, subclass of B (from same package)
 */

package package2;
import package1.*;

public class Bsub extends B{
    static String protectedMessage = B.protectedMessage;
    static String publicMessage = B.publicMessage;

    public static void main(String[] args) {
        System.out.println(protectedMessage);
        System.out.println(publicMessage);
    }
}
