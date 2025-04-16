import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;



public class createfileandwriter {
    public static void main(String[] args) throws IOException {
        String fileName="example1";
        File file=new File(fileName);
        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully");
            } else {
                System.out.println("file already exist or failed to create");
            }
            FileWriter writer=new FileWriter(fileName);
            writer.write("vintage");
            System.out.println("content has be written");
            writer.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}

