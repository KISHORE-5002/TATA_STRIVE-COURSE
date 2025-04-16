import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class insert {
    public static void main(String[] args) throws Exception {
        //another method
        int id=8;
        String name="kishore";
        String sql = "insert into student value("+id+",'"+name+"')";
        //String sql = "insert into student value(7,'nandu')";
        String url = "jdbc:mysql://localhost:3306/tatastrive";
        String username = "root";
        String password = "kishore";//load and register
        Connection con = DriverManager.getConnection(url, username, password);//connection
        Statement st = con.createStatement();//statement
        int count = st.executeUpdate(sql);
        System.out.println(count + "row inserted successfully");

    }
}
