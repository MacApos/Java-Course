/* FileReader = read the content of a file as stream of characters.
 *              One by one read() returns an int value which contains the byte value.
 *              When read() returns -1 there is no more data to be written.
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class file_reader {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("D:\\JavaProjects\\Tutorial\\shrek.txt");
            
            try {
                int data = reader.read();
                while(data != -1) {
                    System.out.print((char)data);
                    data = reader.read();
                }
            }
            catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
