import java.io.FileReader;
import java.io.IOException;
public class filehandling {
    public static void main(String[] args) {
        String filename="example13";
        try(FileReader reader=new FileReader(filename)){
            int chararter;
            while((chararter= reader.read())!=-1){
                System.out.println((char)chararter);
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
