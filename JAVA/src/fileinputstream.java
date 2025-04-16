import java.io.FileReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class fileinputstream {
    public static void main(String[] args) {
//        String filename="example4";
//        try(FileReader reader=new FileReader(filename)){
//            int byteValue;
//            while((byteValue= reader.read())!=-1){
//                System.out.println((char)byteValue);
//            }
//        }
//        catch(IOException e){
//            System.out.println(e);
//        }
        String filename="example4";
        try{
            List<String>lines= Files.readAllLines(Paths.get(filename));
            for(String line:lines){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
