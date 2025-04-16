import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class instupdatedelete {
    public static void main(String[] args)throws Exception {
        String sql_query="select * from menu where sno=1";
        String sql_queryi="insert into menu value(9,'rice','3qt',150)";
        String sql_queryu="update menu set price=190 where qt='2qt'";
        String sql_queryd="delete from menu where sno=7";
        String url="jdbc:mysql://localhost:3306/databasejs";
        String name="root";
        String password="kishore";
        Connection connect= DriverManager.getConnection(url,name,password);
        Statement state=connect.createStatement();
        ResultSet result= state.executeQuery(sql_query);
        result.next();
        String ans=result.getString(2);
        System.out.println(ans);

        int add= state.executeUpdate(sql_queryi);
        System.out.println(add+"inserted");

        int update= state.executeUpdate(sql_queryu);
        System.out.println(update+"updated");

        int delete= state.executeUpdate(sql_queryd);
        System.out.println(delete+"deleted");
    }
}
