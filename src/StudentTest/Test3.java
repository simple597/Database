package StudentTest;

import Dao.DAOFactory;
import Entity.Student;

public class Test3 {
    public static void main(String[] args) {
        Student student = new Student("0592","王海强","男","计科02","1986-11-06","13812906970");
        DAOFactory.getInstance().getStudentDAO().updateStudent(student);
    }
}
