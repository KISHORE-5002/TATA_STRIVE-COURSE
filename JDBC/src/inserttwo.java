import java.sql.*;

public class inserttwo {
    public static void main(String[] args, String sql) throws SQLException {
    int id = 9;
    String name = "sathya";
    //String sql = "insert into student value(" + id + ",'" + name + "')";    //second
    //String sql = "insert into student value(7,'nandu')";
    String url = "jdbc:mysql://localhost:3306/tatastrive";
    String username = "root";
    String password = "kishore";//load and register
    Connection con = DriverManager.getConnection(url, username, password);//connection
        PreparedStatement st=con.prepareStatement(sql);
        st.setInt(1,id);
        st.setString(2,name);
    int count = st.executeUpdate(sql);
    System.out.println(count +"row inserted successfully");
}
}
