package Dao;

import Entity.Student;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

public class StudentDAOImpl extends DAOBase implements StudentDAO {
    private static final String STUDENT_INSERT_SQL = "INSERT INTO student(sno,sname,sex,majorclass,birthday,telephone) VALUES(?,?,?,?,?,?) ";

    @Override
    public void addStudent(Student student) {
        Connection con = null;
        try {
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(STUDENT_INSERT_SQL);
            psmt.setString(1, student.getSno());
            psmt.setString(2, student.getSname());
            psmt.setString(3, student.getSex());
            psmt.setString(4, student.getMajorclass());
            psmt.setString(5, student.getBirthday());
            psmt.setString(6, student.getTelehphone());
            psmt.executeUpdate();
            psmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }

    private static final String STUDENT_UPDATE_SQL = "UPDATE student SET sno=?, sname=?, sex=?, majorclass=?, birthday =? ,telephone=? where sno=?";

    @Override
    public void updateStudent(Student student) {
        Connection con = null;
        try {
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(STUDENT_UPDATE_SQL);
            psmt.setString(7, student.getSno());
            psmt.setString(1,student.getSno());
            psmt.setString(2,student.getSname());
            psmt.setString(3,student.getSex());
            psmt.setString(4,student.getMajorclass());
            psmt.setString(5,student.getBirthday());
            psmt.setString(6,student.getTelehphone());
            System.out.println("修改记录条数:"+psmt.executeUpdate());
            psmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    private static final String STUDENT_DELETE_SQL = "DELETE from student where sname=?";
    @Override
    public void deleteStudent(String sname) {
        Connection con = null;
        try {
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(STUDENT_DELETE_SQL);
            psmt.setString(1,sname);
            System.out.println("删除记录条数:"+psmt.executeUpdate());
            psmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static final String STUDENT_SELECT_SQL = "SELECT sno,sname,sex,majorclass,birthday,telephone FROM student WHERE sno=?";

    @Override
    public Student getStudent(String student_no) {
        Connection con = null;
        Student student = new Student();
        try {
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(STUDENT_SELECT_SQL);
            psmt.setString(1, student_no);
            ResultSet rs = psmt.executeQuery();
            while (rs.next()) {
                student.setSno(rs.getString("sno"));
                student.setSname(rs.getString("sname"));
                student.setSex(rs.getString("sex"));
                student.setMajorclass(rs.getString("majorclass"));
                student.setBirthday(rs.getString("birthday"));
                student.setTelehphone(rs.getString("telephone"));
            }
            psmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return student;
    }
}
