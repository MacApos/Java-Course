public class printf {
    public static void main(String[] args) {

        // printf =     two arguments = format string + (object/variable/value)
        //              % [flags] [precision] [width] [conversion-character]

        boolean myBoolean = true;
        int myInt = 50;
        char myChar = '@';
        String myString = "Bro";
        double myDouble = 1000;

        System.out.printf("%b", myBoolean);
        System.out.println();
        System.out.printf("%c", myChar);
        System.out.println();
        System.out.printf("%s", myString);
        System.out.println();
        System.out.printf("%d", myInt);
        System.out.println();
        // f = stands for float and doubles
        System.out.printf("%f", myDouble);
        System.out.println();

        
        // [width] = minimum characters to be written as output
        System.out.printf("This is my variable: %10s", myString);
        System.out.println();

        // [precision] = sets number of digits of precision when outputting floating-point (or double) values
        System.out.printf("This is my variable: %.2f", myDouble);
        System.out.println();

        // [falgs] = ad an effect to the output based on flag added to format specifier
        // - : left-justify
        // + : output a plus or minus sign to numeric value
        // 0 : numeric values are zero-padded
        // , : coma grouping separator if numbers > 1000

        System.out.printf("This is my variable: %,f", myDouble);
        System.out.println();

    }

}
