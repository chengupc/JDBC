
import	java.sql.Statement;
import java.sql.Connection;
import	java.sql.ResultSet;
import java.sql.SQLException;

class TestJsedbc {
    public static void main(String[] args) throws SQLException {

        Connection conn = MyUtil.getConnection();

        String sql = "select * from runoob_tbl";

        Statement stmt = null;

        ResultSet rs = MyUtil.getStatement(conn, stmt, sql);

        while (rs.next()){
            String author = rs.getString("runoob_author");
            System.out.println("author:"+ author);
        }
        MyUtil.getCloss(conn,rs);
    }
}
