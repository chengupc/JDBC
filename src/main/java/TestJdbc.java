
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

class TestJsedbc {
    public static void main(String[] args) throws SQLException {

        //初始化
        Connection conn = null;
        PreparedStatement ps = null;
        Statement stmt = null;

        //连接
        conn = MyUtil.getConnection(conn);

        //插入
        IpInfo ip1 = new IpInfo("山东", 555);
        MyUtil.getInsert(conn, ip1, ps);

        //查询
        String sql = "select * from runoob_tbl";
        ResultSet rs = null;
        rs = MyUtil.getStatement(conn, stmt, rs, sql);

        while (rs.next()) {
            String author = rs.getString("runoob_author");
            System.out.println("author:" + author);
        }
    }
}
