import java.io.File;

public class deletefile {
    public static void main(String[] args) {
        File file=new File("example13");
        if(file.exists()){
            if(file.delete()){
                System.out.println("File deleted successfully");
            }
            else{
                System.out.println("failed to delete");
            }
        }
        else{
            System.out.println("File doen't exist");
        }
    }
}
