package Druid;
import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;
import java.sql.Statement;
import java.sql.ResultSet;
import com.alibaba.druid.pool.DruidDataSourceFactory;

public class Druid {
    public static void main(String[] args) {
        try {
            Properties properties = new Properties();//1.建立读取配置文件的Properties
            InputStream is = Druid.class.getClassLoader().getResourceAsStream("druid.properties");//2.将配置文件转为字节流
            properties.load(is);//3.使用properties对象加载is
            System.out.println(properties.getProperty("username"));
            DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);//通过Druid底层的工厂设计模式加载配置文件，创建DruidDataSource对象
            Connection conn1 = dataSource.getConnection();
            Statement stmt = conn1.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT avg(Score1),avg(Score2),avg(Score3)  from student,class,studentclass where student.sno=studentclass.SNo and studentclass.CNo = class.CN and student.sex = '男'");//SQL Server是三级结构，应写为数据库名.dbo.数据表名
            while (rs.next()) {
                System.out.println("Class1:"+rs.getString(1));
                System.out.println("Class2:"+rs.getString(2));
                System.out.println("Class3:"+rs.getString(3));
            }
            is.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
