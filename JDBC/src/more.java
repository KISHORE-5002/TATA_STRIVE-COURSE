import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class more {
    public static void main(String[] args) throws Exception {
        String sql = "select * from student";
        String url = "jdbc:mysql://localhost:3306/tatastrive";
        String username = "root";
        String password = "kishore";//load and register
        Connection con = DriverManager.getConnection(url, username, password);//connection
        Statement st = con.createStatement();//statement
        ResultSet rs = st.executeQuery(sql);//execute0
        String data="";
        while(rs.next()) {
            data = rs.getInt(1) + ":" + rs.getString(2);

            System.out.println(data);
        }
    }
}
