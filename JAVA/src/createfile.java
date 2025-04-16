import java.io.File;
import java.io.IOException;
public class createfile {
    public static void main(String[] args) throws IOException {
        String fileName="example12";
        File file=new File(fileName);
        if (file.createNewFile()){
            System.out.println("File created successfully");
        }
        else{
            System.out.println("file already exist or failed to create");
        }
    }
}
