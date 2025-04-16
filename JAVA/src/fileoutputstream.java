
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
public class fileoutputstream {
    public static void main(String[] args) {
//      String fileName="example3.txt";
//      try(FileOutputStream fos=new FileOutputStream(fileName)){
//          System.out.println("file created successfully");
//      }
//      catch(IOException e){
//          System.out.println(e);
//      }



        String fileName="example3.txt";
        String content="D:MY LOVE\1000093737.jpg";

      try(FileOutputStream fos=new FileOutputStream(fileName)){
          byte[]bytes=content.getBytes();
          fos.write(bytes);
          System.out.println("file created successfully");
      }
      catch(IOException e){
          System.out.println(e);
      }



    }
}
