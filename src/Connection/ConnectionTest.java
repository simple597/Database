package Connection;

import Entity.Student;

import java.sql.*;
import java.sql.Connection;
public class ConnectionTest {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = ConnectionManagement.getConnection();//创建链接
            String sql = "insert into student values(?,?,?,?,?,?)";//6个参数用?替代
            ps = conn.prepareStatement(sql);//装入sql语句
            ps.setString(1,"0456");
            ps.setString(2,"陈天");
            ps.setString(3,"男");
            ps.setString(4,"计科02");
            ps.setString(5,"1980-09-12");
            ps.setString(6,"18547963255");
            int result_num1 = ps.executeUpdate();
            ps.setString(1,"0457");
            ps.setString(2,"林学");
            ps.setString(3,"男");
            ps.setString(4,"计科03");
            ps.setString(5,"1970-09-12");
            ps.setString(6,"18457963255");
            int result_num2 = ps.executeUpdate();
            System.out.println("插入记录数量为:"+(result_num1+result_num2));
        } catch (SQLException sqlE) {
            sqlE.printStackTrace();
        } finally {
            ConnectionManagement.closePreStatement(ps);//释放PreparedStatement连接
            ConnectionManagement.closeConnection(conn);//释放Connection连接

        }
    }
}
