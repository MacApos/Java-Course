/* File =   the abstract representation of file and directory pathnames.
 */

import java.io.File;
import java.io.IOException;

public class file_class {
    public static void main(String[] args) {

        try {
            File file = new File("D:\\JavaProjects\\Tutorial\\acces_code.txt");
            File nwefile = new File("D:\\JavaProjects\\Tutorial\\acces_code_new.txt");

            if (file.exists()) {
                System.out.println("File exists.");
                System.out.println(file.getPath());
                System.out.println(file.getAbsolutePath());
                System.out.println(file.isFile());
                System.out.println("Deleting the file.");
                file.delete();
            }
            
            if (nwefile.createNewFile()) {
            System.out.println("File created: " + file.getName());
            }
        
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
