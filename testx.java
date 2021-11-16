package jdbcdemo;
import java.sql.*;
public class testx{
    public static final String DBURL="jdbc:mysql://localhost:3306/emp/";
    public static final String DBUSER="root";
    public static final String DBPASS="admin";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Driver mydriver=new com.mysql.jdbc.Driver();

            DriverManager.registerDriver(mydriver);
            Connection con=DriverManager.getConnection(DBURL, DBUSER, DBPASS);

            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * from emp");
            while (rs.next()) {
                System.out.println(rs.getInt(0)+" "+rs.getString(1)+" "+rs.getString(2));
                // rs.getDate(columnLabel)

            }
            con.close();
            stmt.close();
            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }
            
    
}