import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class update {
    public static void main(String[] args)throws Exception {
        String sql = "update student set name='naveen' where id=6";
        String url = "jdbc:mysql://localhost:3306/tatastrive";
        String username = "root";
        String password = "kishore";//load and register
        Connection con = DriverManager.getConnection(url, username, password);//connection
        Statement st = con.createStatement();//statement
        int count = st.executeUpdate(sql);
        System.out.println(count+"change");
    }
}
