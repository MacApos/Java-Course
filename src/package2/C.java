/*
 * Different package from A, non-subclass
 */

package package2;
import package1.*;

public class C {
    static String publicMessage = B.publicMessage;

    public static void main(String[] args) {
        System.out.println(publicMessage);
    }
}
