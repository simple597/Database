package Dao;

public class DAOFactory {
    private static final DAOFactory daoFactory;
    static {
        daoFactory = new DAOFactory();
    }
    private DAOFactory(){

    }

    public static DAOFactory getInstance(){
        return daoFactory;
    }

    public StudentDAO getStudentDAO(){
        return new StudentDAOImpl();
    }
    public ScoreDAO getScoreDAO(){
        return new ScoreDAOImpl();
    }
}
