import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class EmployeePayroll{
        public static void main(String[] args) {
            // Check File Exists
        Path filePath = Paths.get("C://Users/raiam/Downloads/property.png");

        if(Files.exists(filePath)){
            System.out.println("File is present");
        }

            // Delete file
        if(Files.exists(filePath)){
            try{
                Files.delete(filePath);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
            // Create Directory
        Path path = Paths.get("C://Users/raiam/Downloads/temp/");
        try {
            Files.createDirectory(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
            // Create File
        File myfile = new File("javafile.txt");
            try{
                myfile.createNewFile();
            }
            catch(Exception e){
                System.out.println("Unable to create a file");
            }
        }
    }