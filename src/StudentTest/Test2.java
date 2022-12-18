package StudentTest;

import Dao.DAOFactory;
import Entity.Student;

public class Test2 {
    public static void main(String[] args){
        Student student = DAOFactory.getInstance().getStudentDAO().getStudent("0531");
        System.out.println(student);
    }
}
