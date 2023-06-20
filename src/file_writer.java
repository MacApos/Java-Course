/* FileWriter
 */

import java.io.FileWriter;
import java.io.IOException;

public class file_writer{
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("D:\\JavaProjects\\Tutorial\\test.txt");
            writer.write("Elo\nelo\n6 2 0\n");
            writer.append("test test");
            writer.close();
        }
        
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}