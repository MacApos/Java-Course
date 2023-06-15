public class wrapper_classes {
    public static void main(String[] args) {

        // wrapper class =  provides a way to use primitive data types as referenced data types
        //                  referenced data types contains useful methodes
        //                  can be used with collections (ex.ArrayList)

        // autoboxing = the automatic conversion that the Java compiler makes between the primitive types and ther corresponding object wrap.
        // unboxing = the reverse of autoboxing. Automatic conversion of wrapped class to primitive.

        // wrapper
        // autoboxing feature
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "hello there";

        if (a==true) {
            System.out.println("Wrapper still works as primitive data type because of unboxing feature.");

        }

    }
    
}