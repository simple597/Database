package Connection;
import java.sql.*;
import java.sql.Connection;
public class ConnectionManagement{
    public static Connection getConnection()  {
        Connection conn = null;//初始化conn
        String url = "jdbc:sqlserver://localhost:1433;DatabaseName=education;user=sa;password=123";
        //连接本地sqlserver,端口号为1433,数据库名字为education,用户名为sa,密码为123
        try{
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");//加载sqlserver的驱动器
            } catch (ClassNotFoundException e) {
                System.out.println("无法找到驱动类");
            }
            conn = DriverManager.getConnection(url);//通过驱动程序建立连接
        }
        catch (SQLException sqle){
            sqle.printStackTrace();
        }
        return conn;//返回连接变量
    }
    public static void closeConnection(Connection conn) throws SQLException {
        conn.close();
    }
    public static void closePreStatement(PreparedStatement ps) throws SQLException {
        ps.close();
    }
    public static void closeResultSet(ResultSet rs) throws SQLException {
        rs.close();
    }
}