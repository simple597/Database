package Dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAOBase implements DAO {
    @Override
    public Connection getConnection() {
        String URL="jdbc:sqlserver://localhost:1433;DatabaseName=education";
        Connection con = null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(URL,"sa","123");

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return con;
    }
}

