import java.sql.*;

public class MyUtil {


        public static Connection getConnection(Connection conn){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://192.168.119.132:3306/sparkWL","root", "199214");
                System.out.println("get sucess");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("failed");
            }
            return conn;
        }
        public static ResultSet getStatement(Connection conn, Statement stmt, ResultSet rs, String sql){
            try {
                stmt = conn.createStatement();
                rs = stmt.executeQuery(sql);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return rs;


        }
        public static void getInsert(Connection conn, IpInfo ipInfo, PreparedStatement ps){
            String sql = "insert into ipCountResult (province, number) values(?,?)";
            try {
                ps = conn.prepareStatement(sql);
                ps.setString(1,ipInfo.getProvince());
                ps.setInt(2,ipInfo.getCounter());
                ps.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

