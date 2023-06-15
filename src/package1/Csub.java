/*
 * Same package as A, subclass of C (from different package)
 */

package package1;
import package2.*;

public class Csub extends C {
		public static void main(String[] args) {
      System.out.println(A.deafultMessage);
      System.out.println(A.protectedMessage);
      System.out.println(A.publicMessage);
    }
}
