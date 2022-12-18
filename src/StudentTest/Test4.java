package StudentTest;

import Dao.DAOFactory;

public class Test4 {
    public static void main(String[] args) {
        DAOFactory.getInstance().getStudentDAO().deleteStudent("张三");
    }
}
