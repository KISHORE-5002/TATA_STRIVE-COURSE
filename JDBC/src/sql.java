import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;//import
import java.sql.ResultSet;
import java.sql.Statement;

public class sql {
    public static void main(String[] args)throws Exception {
        String sql ="select name from student where id=1";
        String url="jdbc:mysql://localhost:3306/tatastrive";
        String username="root";
        String password="kishore";//load and register
        Connection con = DriverManager.getConnection(url,username,password);//connection
        Statement st= con.createStatement();//statement
        ResultSet rs=st.executeQuery(sql);//execute0
        rs.next();
        String name=rs.getString(1);
        System.out.println(name);
    }
}
