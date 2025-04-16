import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.nio.file.Paths;

public class filewrite {
    public static void main(String[] args) {
//        String FileName="example4";
//        try
//        {
//            Files.write(Paths.get(FileName),"hey is the file is created code has been done perfetly ?".getBytes());
//            System.out.println("file created successfuly");
//        } catch (IOException e) {
//            System.out.println(e);
//        }




        String FileName="example4";
        String content="should this the program is runnning"+" "+"i run successfully";
        try
        {
            Files.write(Paths.get(FileName),"hey is the file is created code has been done perfetly ?".getBytes());
            System.out.println("file created successfuly");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
