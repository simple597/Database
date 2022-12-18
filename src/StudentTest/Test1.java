package StudentTest;

import Dao.DAOFactory;
import Entity.Student;

public class Test1 {
    public static void main(String[] args){
        Student student = new Student();
        student.setSno("4010");
        student.setSname("张三");
        student.setSex("男");
        student.setMajorclass("信息05");
        student.setBirthday("2001-1-1");
        student.setTelehphone("1777777777");

        DAOFactory.getInstance().getStudentDAO().addStudent(student);

    }
}
